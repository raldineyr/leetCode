
class Solution {

public int mostWordsFound(String[] sentences) {
    int maximum = 0;
    for(int i = 0; i < sentences.length; i++){
        int len = sentences[i].split(" ").length;
        if(len > maximum){
            maximum = len;
        }
    }
              
    return maximum;
    }
}
