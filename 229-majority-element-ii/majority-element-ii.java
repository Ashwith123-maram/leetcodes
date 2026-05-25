class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0&&nums[i]!=e2){
                c1=1;
                e1=nums[i];
            }else if(c2==0&&nums[i]!=e1){
                c2=1;
                e2=nums[i];
            }
            else if(nums[i]==e1) c1++;
            else if(nums[i]==e2) c2++;
            else{
                c1--;
                c2--;
            }
            
        }
        int c11=0,c22=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==e1)c11++;
            else if(nums[i]==e2)c22++;

        }
        int min=((nums.length/3)+1);
        if(c11>=min)l.add(e1);
        if(c22>=min)l.add(e2);
        return l;
    }
}