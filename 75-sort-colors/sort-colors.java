class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void sortColors(int[] nums) {
        int m=0;
        int l=0;
        int r=nums.length-1;
        while(m<=r){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;

            }else if(nums[m]==1){
                m++;
            }else{

            
            swap(nums,m,r);
            r--;
            
            }

        }
        


        
    }
}