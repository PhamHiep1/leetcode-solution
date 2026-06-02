class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(var str: strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String newStr = new String(s);
            map.computeIfAbsent(newStr,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}