class Solution {
    public int singleNumber(int[] nums) {
       
             
    int identifier = 0; 
    for (int numberIn : nums) { 
        
      identifier = identifier ^ numberIn;
        
    }
    return identifier;
  }      
}
