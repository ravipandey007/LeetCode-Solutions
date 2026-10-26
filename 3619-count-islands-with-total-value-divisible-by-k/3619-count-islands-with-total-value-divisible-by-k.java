class Solution {
    int m, n;
    int [] [] directions = {
        {0, 1}, 
        {0, -1},
        {1, 0}, 
        {-1, 0}
    };
    public long dfs(int i , int j , int[][]grid){
        long sum = grid[i][j];
        grid[i][j] = 0;

        for(int [] dir : directions){
            int newRow = i+dir[0];
            int newCol = j+dir[1];

            if(newRow >= 0 && newRow < m &&
              newCol >= 0 && newCol < n &&
              grid[newRow][newCol] > 0){

                sum += dfs(newRow, newCol, grid);
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(grid[i][j] > 0){
                    long sum = dfs(i, j, grid);

                    if(sum % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}