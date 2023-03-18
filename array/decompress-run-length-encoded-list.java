class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sumFrequence = 0;
        for(int i = 0; i < nums.length; i+=2){
            sumFrequence += nums[i];
        }
        int[] response = new int[sumFrequence];
        int index = 0;
        for(int i = 0; i < nums.length; i +=2){
            int frequence = nums[i], value = nums[i+1];
            while(frequence-- > 0){
                response[index++] = value;
            }
        } 

        return response;
    }
}
