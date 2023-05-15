class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int j = i + 1;
            int discount = 0;
            while (j < prices.length && prices[i] < prices[j]) {
                j++;
            }
            if (j < prices.length) {
                discount = prices[j];
            }
            answer[i] = prices[i] - discount;
        }

        return answer;
    }
}
