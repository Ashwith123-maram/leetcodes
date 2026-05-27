import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        // Check all possible triplets
        for (int i = 0; i < n; i++) {
            HashSet<Integer>hs=new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //for (int k = j + 1; k < n; k++) {
                int k=-(nums[i]+nums[j]);
                if(hs.contains(k)){
                    //if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], k);
                        Collections.sort(temp); // Sort to ensure uniqueness in the Set
                        st.add(temp);
                    }
                     hs.add(nums[j]);
                }
               
            
        }
        return new ArrayList<>(st);
    }
}