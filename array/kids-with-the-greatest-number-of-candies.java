class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> res= new ArrayList();
        
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for(int i = 0; i < candies.length; i++){
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }
}
