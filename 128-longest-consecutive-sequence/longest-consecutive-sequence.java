class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int max=0;

        for(int i:hs){

            if(!hs.contains(i-1)){
                int strt=i;
                int c=1;
                while(hs.contains(i+1)){
                    c++;
                    i++;
                }
                max=Math.max(max,c);

            }
            
        }
        return max;
    }
}