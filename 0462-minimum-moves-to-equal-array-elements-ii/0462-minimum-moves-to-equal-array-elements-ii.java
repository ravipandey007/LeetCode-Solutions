class Solution {
    public static double findMed(int[] nums){
        Arrays.sort(nums);

        int n = nums.length;
        if(n % 2 == 1){
            return nums[n/2];
        }
        else{
            return (nums[n/2-1] + nums[n/2]) /2.0;
        }
    }

    public int minMoves2(int[] nums) {
        int x = (int) findMed(nums);
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > x){
                count += nums[i] - x;
            }
            else if(nums[i] < x){
                count += x - nums[i];
            }
        }
        return count;
    }
}