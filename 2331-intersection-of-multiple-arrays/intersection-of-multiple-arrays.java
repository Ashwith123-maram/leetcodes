class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for(int j:nums[i]){

            
            hm.put(j, hm.getOrDefault(j,0)+1);
            }
        }
        for(Integer i:hm.keySet()){
            if(hm.get(i)==nums.length){
                l.add(i);
            }
        }
        Collections.sort(l);
        return l;
        
    }
}