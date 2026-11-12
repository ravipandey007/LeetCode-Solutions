class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc_count = 1;
        int dec_count = 1;
        int ans1 = 1;
        int ans2 = 1;

        for(int i = 1; i < nums.length; i++){
            //if same --> continue
            if(nums[i] == nums[i- 1]){
                dec_count = 1;
                inc_count = 1;
                continue;
            }
            //if greater inc.count++:
            
            if(nums[i] > nums[i-1]){
                inc_count++;
                dec_count = 1;

            }else{          //else dec.count++ and re-assin the value of inc.count to 1:
                dec_count++;
                inc_count = 1;
            }
            //to store the biggest subarray length:
            if(inc_count > ans1){
                ans1 = inc_count;
            }
            if(dec_count > ans2){
                ans2 = dec_count;
            }
        }
        
        return Math.max(ans1, ans2);

    }
}