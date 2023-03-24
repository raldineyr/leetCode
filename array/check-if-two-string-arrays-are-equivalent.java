public class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

       
        StringBuilder sb1 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        String str1 = sb1.toString();

        StringBuilder sb2 = new StringBuilder();
        for (String s : word2) {
            sb2.append(s);
        }
        String str2 = sb2.toString();

        return str1.equals(str2);
    }
}
