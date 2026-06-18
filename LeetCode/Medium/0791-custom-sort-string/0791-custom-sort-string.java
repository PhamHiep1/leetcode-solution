public class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder res = new StringBuilder();
        for (char c : order.toCharArray()) {
            int idx = c - 'a';
            while (count[idx] > 0) {
                res.append(c);
                count[idx]--;
            }
        }

        for (int idx = 0; idx < 26; idx++) {
            char c = (char) ('a' + idx);
            while (count[idx] > 0) {
                res.append(c);
                count[idx]--;
            }
        }

        return res.toString();
    }
}