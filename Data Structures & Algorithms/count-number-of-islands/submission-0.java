class Solution {
    public int numIslands(char[][] grid) {
        int islandsCount = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    islandsCount++;
                };
            }
        }
        return islandsCount;
    }

    private void dfs(char[][] grid, int r, int c) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        if (Math.min(r, c) < 0 || r == ROWS || c == COLS || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);

        return;
    }
}
