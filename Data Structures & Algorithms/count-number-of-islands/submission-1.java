class Solution {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int numIslands(char[][] grid) {    
        int islandsCount = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    islandsCount++;
                };
            }
        }
        return islandsCount;
    }

    private void bfs(char[][] grid, int r, int c) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        Deque<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{r, c});
        grid[r][c] = '0';

        while(!que.isEmpty()){
            int[] ele = que.poll();

            for(int[] d : DIRECTIONS){
                r = ele[0] + d[0];
                c = ele[1] + d[1];

                if(r >= 0 && c >= 0 && r < ROWS && c < COLS && grid[r][c] == '1'){
                    grid[r][c] = '0';
                    que.offer(new int[]{r, c});
                }
            }
        }
        return;
    }
}
