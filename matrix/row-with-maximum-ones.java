class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int maxOnesRow = 0;
        for (int i = 0; i < mat.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                maxOnesRow = i;
            }
        }
        return new int[] {maxOnesRow, maxOnes};
    }
}
