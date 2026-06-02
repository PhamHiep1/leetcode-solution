class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxArea=0;

        while(l<r){
            int distance = r-l;
            
            if(heights[r]>heights[l]){
                maxArea = Math.max(maxArea,(distance*heights[l]));
                l++;
            }
            else{
                maxArea = Math.max(maxArea,(distance*heights[r]));
                r--;
            }
            
        }
        return maxArea;
    }
}
