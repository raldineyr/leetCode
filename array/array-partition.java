class Solution {
    public int arrayPairSum(int[] nums) {
        int maximized = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2) {
            maximized += nums[i];
        }
        return maximized;
    }
}
