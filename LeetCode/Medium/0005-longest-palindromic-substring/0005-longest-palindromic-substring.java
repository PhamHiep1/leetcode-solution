class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expendAroundCenter(s, i, i);
            int len2 = expendAroundCenter(s, i, i + 1);
            
            int maxLen = Math.max(len1,len2);
            if(maxLen > end-start+1){
                start = i - (maxLen-1)/2;
                end = i + maxLen/2;
            }
        }
        return s.substring(start, end+1);
    }

    private int expendAroundCenter(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}