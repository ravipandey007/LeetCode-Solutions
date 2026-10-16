class Solution {
    static void shift(int[] nums, int pos){
        for(int i = pos; i < nums.length - 1; i++){
            nums[i] = nums[i+1];
        }
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 1;
        int i = 1;

        while(i < n){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > 2){
                    shift(nums, i);
                    n--;
                    continue;
                }
            }
            else{
                count = 1;
            }
            i++;
        }
        return n;
    }
}