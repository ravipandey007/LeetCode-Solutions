class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int l = 1;
       for(int i = 0; i < n; i++){
        if(n % l == 0){
            nums[i] *= nums[i];
            sum += nums[i];
            l++;
        }
        else
        l++;
       }
        return sum;
    }
}