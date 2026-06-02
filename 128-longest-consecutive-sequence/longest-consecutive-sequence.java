class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> set = new HashSet<>();

        for(var x: nums){
            set.add(x);
        }

        for(var x: set){
            if(!set.contains(x-1)){
                int cnt = 1;
                int currentNum=x;

                while(set.contains(currentNum+1)){
                    cnt++;
                    currentNum++;
                }
                res = Math.max(cnt,res);
            }
            
        }

        return res;
    }
}
