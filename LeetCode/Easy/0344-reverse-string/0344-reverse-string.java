class Solution {
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }

    public void reverseHelper(char[] s, int left, int right){
        if(left >= right){
            return ;
        }

        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;

        reverseHelper(s, left+1, right-1);
    }
}