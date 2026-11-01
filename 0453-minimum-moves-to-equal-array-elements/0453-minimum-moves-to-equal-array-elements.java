class Solution {
    public static int minEle(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public int minMoves(int[] nums) {
        int count = 0;
        int x = minEle(nums);
        for(int i = 0; i < nums.length; i++){
            count += nums[i] - x;
        }
    return count;
    }
}