class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] cnt = new int[101];

        for(var x: nums){
            if(cnt[x] == 0){
                cnt[x]++;
                sum += x;
            }else if(cnt[x] == 1){
                cnt[x]++;
                sum -= x;
            }
        }
        return sum;
    }
}