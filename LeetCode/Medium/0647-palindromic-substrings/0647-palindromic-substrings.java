class Solution {

    public int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            count += expandAroundCenter(s,i,i);
            count += expandAroundCenter(s,i,i+1);
        }
        
        return count;
    }
    private int expandAroundCenter(String s, int l, int r){
        int count = 0;
        while(l >=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
            count++;
        }
        return count;
    }
}