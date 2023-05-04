class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0, temp = 0;
            while(nums[i] > 0){
               temp = nums[i];
               nums[i] = temp /10;
                count++;
            }
            if(count % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
