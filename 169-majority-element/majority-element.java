class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int el=0;  
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }

        }
        int c1=0;
        for(int j=0;j<n;j++){
            if(nums[j]==el){
                c1++;
            }
        }
        if(c1>n/2){
            return el;
        }
        return -1;
       
        
    }
}