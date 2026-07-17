class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            if(!numsSet.add(num)){
                return true;
            }
        }
        return false;
    }
}