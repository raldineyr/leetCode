class Solution
{
    public int[] sortArray(int[] nums) 
    {
    for(int count = 1; count < nums.length; count++){
            
    int underAnalysis = count;
            
    while(underAnalysis > 0 && nums[underAnalysis] < nums[underAnalysis -1]){
                
    int analyzedNumber = nums[underAnalysis];
    int predecessorNumber = nums[underAnalysis -1];
                
    nums[underAnalysis] = predecessorNumber;
    nums[underAnalysis -1] = analyzedNumber;
        
    underAnalysis --;
                
      }
    }
        return nums;
  }
}
