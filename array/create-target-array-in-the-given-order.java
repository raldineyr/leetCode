class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]); 
        }
        
        int[] response = new int[target.size()];
        
        for (int i = 0; i < target.size(); i++) {
            response[i] = target.get(i); 
        }
        
        return response;
    }
}
