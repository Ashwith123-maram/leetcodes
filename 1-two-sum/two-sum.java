class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(hm.containsKey(x)){
                arr[0]=hm.get(x);
                arr[1]=i;
            }
            hm.put(nums[i],i);
        }
        return arr;
        
    }
}