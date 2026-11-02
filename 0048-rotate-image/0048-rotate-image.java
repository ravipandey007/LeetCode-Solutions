class Solution {
    public void swap(int[][] m, int i, int j, int x, int y) {
        int temp = m[i][j];
        m[i][j] = m[x][y];
        m[x][y] = temp;
    }

    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public void rotate(int[][] m) {
        int n = m.length;

        //Transpose of Matrix : 

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                swap(m, i, j, j, i);
            }
        }
        //Reverse each row : 
        for(int i = 0; i < n; i++){
            reverse(m[i], 0, n - 1);
        }
    }
}