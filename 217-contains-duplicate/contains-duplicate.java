class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(var x :nums){
            if(!set.add(x)){
                return true;
            }
        }
        return false;
    }    
    
}