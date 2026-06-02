class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length-1;
        int l = 0;

        while(l<=r){
            if(nums[l] == val ){
                nums[l] = nums[r--];
            }
            else{
                l++;
            }
        }
        return l;
    }

}