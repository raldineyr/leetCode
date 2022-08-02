import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

   int totalJewels = 0;
        for(int counter = 0; counter < stones.length(); counter ++){
            if(jewels.indexOf(stones.charAt(counter)) != -1)
            {
                totalJewels++;
            }
        }
        
        return totalJewels;
    }
}
