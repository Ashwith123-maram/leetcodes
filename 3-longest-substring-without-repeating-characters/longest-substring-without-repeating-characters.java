class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>hs=new LinkedHashSet<>();
        int ans=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            
            
            while(hs.contains(ch)){
                
                hs.remove(s.charAt(l));

                l++;
            }
            hs.add(ch);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}