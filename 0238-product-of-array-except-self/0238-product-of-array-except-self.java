class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        int[] suffix = new int[n];
        int[] preffix = new int[n];

        preffix[0] = 1;

        for (int i = 1; i < n; i++) {
            preffix[i] = preffix[i - 1] * nums[i - 1];
        }



        suffix[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }




        for (int i = 0; i < n; i++) {
            result[i] = preffix[i] * suffix[i];
        }



        return result;
    }
}