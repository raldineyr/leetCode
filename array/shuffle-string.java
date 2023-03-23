class Solution {
    public String restoreString(String s, int[] indices) {
        char[] response = new char[indices.length];
        char[] string = s.toCharArray();

        for(int i = 0; i < indices.length; i++){
           response[indices[i]] = string[i];
        }
        String str = new String(response);
    
    return str;
    }
}
 
