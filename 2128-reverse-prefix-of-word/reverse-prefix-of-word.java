class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chr=word.toCharArray();
        int idx=word.indexOf(ch);
        int i=0;
        int j=idx;
        while(i<=j){
            char temp=chr[i];
            chr[i]=chr[j];
            chr[j]=temp;
            i++;
            j--;
        }
        return new String(chr);
        
    }
}