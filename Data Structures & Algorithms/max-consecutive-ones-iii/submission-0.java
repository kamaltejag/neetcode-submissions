class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0, count = 0, l = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 1){
                count++;
            }
            while((r - l + 1) - count > k){
                if(nums[l] == 1){
                    count--;
                }
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}