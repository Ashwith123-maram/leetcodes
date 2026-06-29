class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++){
            r=Math.max(r,piles[i]);

        }
        while(l<r){
            int mid=(l+r)/2;
            int c=0;
            for(int i=0;i<piles.length;i++){
                c+=(piles[i]+mid-1)/mid;
            }
            if(c<=h){
                r=mid;
            }
            else{
                l=mid+1;
            }
            
        }
        return l;
        
    }
}