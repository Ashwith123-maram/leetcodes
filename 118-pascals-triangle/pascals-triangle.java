class Solution {
    public List<Integer> row(int n){
        List<Integer>l=new ArrayList<>();
        long ans=1;
        l.add(1);
        for(int i=0;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
            l.add((int)ans);
        }
        return l;

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>m=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> x=row(i);
            m.add(x);

        }
        return m;
        
    }
}