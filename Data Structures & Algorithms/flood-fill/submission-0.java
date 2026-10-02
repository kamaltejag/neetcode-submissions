class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org = image[sr][sc];
        if(org == color) return image;
        int m = image.length, n = image[0].length;
        dfs(image, sr, sc, org, color, m, n);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int org, int color, int m, int n){
        if(r < 0 || r >= m || c < 0  || c >= n || image[r][c] != org) return;

        image[r][c] = color;
        dfs(image, r + 1, c, org, color, m, n);
        dfs(image, r - 1, c, org, color, m, n);
        dfs(image, r, c + 1, org, color, m, n);
        dfs(image, r, c - 1, org, color, m, n);
    }
}