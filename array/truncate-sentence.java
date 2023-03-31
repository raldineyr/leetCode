class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder string = new StringBuilder();
        String[] words = s.split(" ");
        for(int counter = 0; counter < k; counter++){
            string.append(words[counter]);
            if (counter != k-1) {
                string.append(" ");
            }
        }
        String response = string.toString();
        return response;
    }
}
