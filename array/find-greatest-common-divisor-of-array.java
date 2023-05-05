class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        
        for (int num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }
        while (smallest != 0) {
            int temp = smallest;
            smallest = largest % smallest;
            largest = temp;
        }
        
        return largest;
    }
}

