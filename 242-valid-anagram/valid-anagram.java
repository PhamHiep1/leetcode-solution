class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            char sChar = s.charAt(i);
            

            map.put(sChar, map.getOrDefault(sChar,0)+1);

        }

        for(int i = 0; i<t.length(); i++){
            char tChar = t.charAt(i);
            if(!map.containsKey(tChar) || map.get(tChar)==0){
                return false;
            }
            map.put(tChar, map.getOrDefault(tChar,0)-1);
        }        
        return true;
    }
}