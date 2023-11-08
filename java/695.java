// Problem: https://leetcode.com/problems/max-area-of-island/description/

class Solution {
    int m;
    int n;
    public int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public boolean[][] seen;
    public int maxArea = 0;
    public int currArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                if(grid[row][col] == 1 && !seen[row][col]) {
                    seen[row][col] = true;
                    currArea++;
                    dfs(row, col, grid);
                    maxArea = Math.max(currArea, maxArea);
                    currArea = 0;
                }
            }
        }
        return maxArea;
    }

    public boolean isValid(int row, int col, int[][] grid) {
        return 0 <= row && row < m && 0 <= col && col < n && grid[row][col] == 1;
    }

    public void dfs(int row, int col, int[][] grid) {
        for(int[] direction: directions) {
            int nextRow = row + direction[0];
            int nextCol = col + direction[1];
            if(isValid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]) {
                currArea++;
                seen[nextRow][nextCol] = true;
                dfs(nextRow, nextCol, grid);
            }
        }
    }
}
