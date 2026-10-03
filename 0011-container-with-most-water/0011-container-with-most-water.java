class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area;
        int ans = Integer.MIN_VALUE;
        while(left < right){
            area = (right - left)*Math.min(height[left], height[right]);
            if(area > ans){
                ans = area;
            }
            if(height[left] < height[right]){
                left++;
            }
            else
            right--;
        }
        return ans;
    }
}