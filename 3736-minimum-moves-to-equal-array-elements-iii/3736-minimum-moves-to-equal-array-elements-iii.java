class Solution {
    public static int MaxEle(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public int minMoves(int[] nums) {
        int count = 0;
        int x = MaxEle(nums);
        for(int i = 0; i < nums.length; i++){
            count += x-nums[i];
        }
        return count;
    }
}