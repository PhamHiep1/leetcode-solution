class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p == null || s == null || p.length() > s.length()){
            return res;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        int windowSize = p.length();

        for(int i = 0; i < windowSize; i++){
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(pCount,sCount)){
            res.add(0);
        }

        for(int right = windowSize; right < s.length(); right++){
            sCount[s.charAt(right)-'a']++;
            
            int left = right - windowSize;
            sCount[s.charAt(left) - 'a']--;

            if(Arrays.equals(sCount, pCount)){
                res.add(left+1);
            }
        }
        return res;
    }
}