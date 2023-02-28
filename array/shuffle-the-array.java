class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            shuffleArray[j++] = nums[i];
            shuffleArray[j++] = nums[n + i];
        }
        return shuffleArray;
    }
}
