class Solution {
    public int first(int[] nums,int x){
        int l=0;
        int r=nums.length-1;
        int f=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==x){
                f=mid;
                r=mid-1;
            }
            else if(nums[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return f;
    }
    public int last(int[] nums,int x){
        int l=0;
        int r=nums.length-1;
        int s=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==x){
                s=mid;
                l=mid+1;
            }
            else if(nums[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return s;
    }
    public int[] searchRange(int[] nums, int target) {
        int f1=first(nums,target);
        int s1=last(nums,target);
       // if(f1==-1) return {-1,-1}
        return new int[]{f1,s1};
        
        
    }
}