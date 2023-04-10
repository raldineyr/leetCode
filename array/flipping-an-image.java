class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {

            int[] reversed = new int[n];
            for (int j = 0; j < n; j++) {
                reversed[j] = image[i][n - j - 1];
            }
            
            for (int j = 0; j < n; j++) {
                result[i][j] = reversed[j] == 1 ? 0 : 1;
            }
        }
        
        return result;
    }
}
