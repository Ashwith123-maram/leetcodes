class Solution {
    public int compress(char[] chars) {
        ArrayList<Character>l=new ArrayList<>();
        int c=0;
        int i=0,j=0;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                c++;
                j++;
            }
            else{
                l.add(chars[i]);
                if(c>1){
                    String s=String.valueOf(c);
                    for(char ch:s.toCharArray()){
                        l.add(ch);
                    }
                }
                i=j;
                c=0;
                
            }}  
        l.add(chars[i]);
        if(c>1){

        String s=String.valueOf(c);
        for(char ch:s.toCharArray()){
        l.add(ch);
        }}
        for(int k=0;k<l.size();k++){
            chars[k]=l.get(k);
        
        
    }
    return l.size();
}
}