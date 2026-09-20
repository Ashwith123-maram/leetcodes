class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("[,\\s]+");
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        String res=String.join(" ",str).trim();
        return res;
    }
}