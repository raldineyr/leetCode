class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int i = 0;
            int j = word.length() - 1;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    break;
                }
                i++;
                j--;
            }
            if (i >= j) {
                return word;
            }
        }
        return "";
    }
}
