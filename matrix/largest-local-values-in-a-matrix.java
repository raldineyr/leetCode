class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length - 2;
        int[][] result = new int[len][len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                int max = grid[i][j];
                for(int iInner = i; iInner <= i + 2; iInner++) {
                    for(int jInner = j; jInner <= j + 2; jInner++) {
                        if(grid[iInner][jInner] > max) {
                            max = grid[iInner][jInner];
                        }
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }
}
