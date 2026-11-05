class Solution {
    public static boolean find(int[] nums, int val, int d){
        for(int i = 0; i < nums.length; i++){
            if(Math.abs(val - nums[i]) <= d){
                return false;
            }
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            if(find(arr2, arr1[i], d) == true){
                count++;
            }
        }
        return count;
    }
}