class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        int[] charIndex = new int[128];
        Arrays.fill(charIndex,-1);

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            if(charIndex[currentChar] >= left){
                left = charIndex[currentChar] + 1;
            }
            charIndex[currentChar] = right;
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}