class Solution {
    public void reverseString(char[] s) {
        Stack <Character> response = new Stack();
        for(char element : s){
            response.push(element);
        }
       for(int i = 0; i < s.length; i++){
           s[i] = response.pop();
           System.out.print(s[i]);
       }
    }
}
