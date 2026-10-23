class Solution {
    public int sortPermutation(int[] nums) {

        int ans = -1; // 111111 (all bits set)

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){ //missplaced numbers 
                ans = (ans & nums[i]);
            }
        }
        return ans == -1 ? 0 : ans;
    }
}