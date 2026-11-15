class Solution {
    public int numOfSubarrays(int[] nums) {
        int M = (int)1e9 + 7;
        int n = nums.length;

        int count = 0;
        int sum = 0;
        int odd = 0;
        int even = 1;

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(sum % 2 == 0){           // odd + even = odd;
                count = (count + odd) % M;
                even++;
            }else{                     // even + odd = odd;
                count = (count + even) % M;
                odd++;
            }
        }
        return count;
    }
}