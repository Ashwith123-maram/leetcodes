class Solution {
    public void rotate(int[][] matrix) {
        
        int m=matrix.length;
        int[][] arr=new int[m][m];
        //int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[j][m-1-i]=matrix[i][j];
            }
           
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
        
        
    }
}