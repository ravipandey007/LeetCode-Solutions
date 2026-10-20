class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
    return 0;
}
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int k = nums[0];
        int count = 0;

        for(int i = 0; i < n; i++){
          if(nums[i] == k){
            count++;
            k++;
            if(count > ans){
                ans = count;
            }
          }
          else if(nums[i] == nums[i-1]){
            continue;
          }
          else{
            k = nums[i];
            i--;
            count = 0;
          }
        }
        return ans;
    }
}