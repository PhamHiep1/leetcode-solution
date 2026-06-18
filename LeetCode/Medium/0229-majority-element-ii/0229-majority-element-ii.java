class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int maxFreq = nums.length / 3;

        for(var num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){   
                res.add(entry.getKey());
            }
        }
        return res;
    }
}