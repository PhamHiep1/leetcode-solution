class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int l = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int r = 0; r<nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                res = Math.min(res, r-l+1);
                sum -= nums[l++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}