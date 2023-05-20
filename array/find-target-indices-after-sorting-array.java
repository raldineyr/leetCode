class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans.add(i); 
            }
        }
        return ans;
    }
}
