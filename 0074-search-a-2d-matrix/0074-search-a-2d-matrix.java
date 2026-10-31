class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int rows = m.length;
        int cols = m[0].length;

        int low = 0;
        int high = rows * cols -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            int row = mid/cols;
            int col = mid%cols;

            if(m[row][col] == t){
                return true;
            }
            else if(m[row][col] < t){
                low = mid + 1;
            }
            else
                high = mid-1;
        }
        return false;
    }
}