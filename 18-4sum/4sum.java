class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n-3; i++) {
            if(i>0 && nums[i]==nums[i-1])continue;
            for (int j = i + 1; j < n-2; j++) {
                if(j!=i+1 && nums[j]==nums[j-1])continue;
                int k=j+1;
                int m=n-1;
                while(k<m){
                    long sum=(long)nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[m];
                    if(sum==target){
                        l.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
                        k++;
                        m--;
                        while(k<m&&nums[k]==nums[k-1])k++;
                         while(k<m&&nums[m]==nums[m+1])m--;


                    }else if(sum<target){
                        k++;
                    }
                    else{
                        m--;
                    }

                    
                }
            }
        }
        return l;
                
    }
}