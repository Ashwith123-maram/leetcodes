class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int c=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int s=sum-k;
            if(hm.containsKey(s)){
                c+=hm.get(s);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        return c;
        
    }
}