class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int length = Integer.MAX_VALUE;
        int l = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

             if (sum >= target) {
                if ((i - l) + 1 < length) {
                    length = (i - l) + 1;
                }
            }

             while (sum >= target) {
                if ((i - l) + 1 < length){
                length = i - l + 1;
                }
                sum -= nums[l];
                l++;
            }
        }
        if(length == Integer.MAX_VALUE){
            return 0;
        }
        return length;
    }
}