class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    int[] allowedChars = new int[26]; 
    int consistentCount = 0;
    
    for (char c : allowed.toCharArray()) {
        allowedChars[c - 'a']++;
    }
    
    for (String word : words) {
        boolean isConsistent = true;
        for (char c : word.toCharArray()) {
            if (allowedChars[c - 'a'] == 0) {
                isConsistent = false;
                break;
            }
        }
        if (isConsistent) {
            consistentCount++;
        }
    }
    
    return consistentCount;
    }
}
