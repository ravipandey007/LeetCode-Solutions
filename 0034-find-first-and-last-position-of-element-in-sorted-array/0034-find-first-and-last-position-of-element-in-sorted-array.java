class Solution {
    public static int Bsearch(int[] nums, int target, boolean findFirst){
         int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {

                ans = mid;

                if (findFirst) {
                    r = mid - 1;
                } 
                else {
                    l = mid + 1;
                }
            }
            else if (target < nums[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {

        int first = Bsearch(nums, target, true);

        if(first == -1){
            return new int[]{-1, -1};
        }
        int last = Bsearch(nums, target, false);

        return new int[]{first, last};
    }
}