class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1){
            return 0;
        }
        
        int left = 0;
        int count = 0;
        int currentProduct = 1;
        for(int right = 0; right < nums.length; right++){
            currentProduct *= nums[right];

            while(currentProduct >= k && left <= right){
                currentProduct /= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
}