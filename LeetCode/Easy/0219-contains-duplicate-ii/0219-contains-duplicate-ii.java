class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k < 0 || nums == null || nums.length <= 1){
            return false;
        }

        Set<Integer> window = new HashSet<>();

        for(int right = 0; right < nums.length; right++){
            if(right > k){
                window.remove(nums[right - k - 1]);
            }

            if(!window.add(nums[right])){
                return true;
            }
        }
        return false;
    }
}