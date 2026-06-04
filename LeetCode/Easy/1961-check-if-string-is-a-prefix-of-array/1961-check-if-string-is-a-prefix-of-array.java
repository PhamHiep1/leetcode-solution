class Solution {
    public boolean isPrefixString(String s, String[] words) {
        if(s == null || words == null || words.length == 0){
            return false;
        }

        int sIdx = 0;
        int sLen = s.length();

        for(var word : words){
            int wordLen = word.length();
            
            for(int i = 0; i < wordLen; i++){
                if(sIdx == sLen){
                    return false;
                }

                if(s.charAt(sIdx) != word.charAt(i)){
                    return false;
                }
                sIdx++;

            }
            
            if(sIdx == sLen){
                return true;
            }
        }
        return false;
    }
}