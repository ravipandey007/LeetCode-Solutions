class Solution {
    public boolean searchMatrix(int[][] m, int t) {

        int r = 0;
        int c = m[0].length -1;

        while(r < m.length && c >= 0){
            if(m[r][c] == t){
                return true;
            }
            else if(m[r][c] < t){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}