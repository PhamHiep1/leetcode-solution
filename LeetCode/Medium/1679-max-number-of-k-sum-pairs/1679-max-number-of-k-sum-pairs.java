class Solution {
    public int maxOperations(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k < 2){
            return 0;
        }   

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(var num: nums){
            int tmp = k - num;
            if(map.getOrDefault(tmp,0) > 0){ 
                count++;
                map.put(tmp, map.get(tmp) - 1);
            }
            else{
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}