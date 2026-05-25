class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        int min=((nums.length)/3)+1;
        for(int i=0;i<nums.length;i++){
            //if(hm.containsKey(i)){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            //}
        }
        for(Integer i:hm.keySet()){

            if(hm.get(i)>=min){
                l.add(i);
            }
        }
        return l;
        
    }
}