class Solution {
    public int triangleNumber(int[] nums) {
        if(nums == null || nums.length <3){
            return 0;
        }
        
        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;

        for(int c = n - 1; c >= 2; c--){
            int b = c - 1;
            int a = 0;
            while(a < b){
                if(nums[a] + nums[b] > nums[c]){
                    count += b - a;
                    b--;
                }
                else{
                    a++;
                }
            }
        }
        return count;
    }
}