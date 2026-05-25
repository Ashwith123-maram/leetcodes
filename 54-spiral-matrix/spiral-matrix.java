import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ls;
        
        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns
        
        int left = 0, top = 0;
        int right = m - 1, bottom = n - 1; // Fixed: right uses column count
        
        while (top <= bottom && left <= right) {
            // 1. Move Right
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;
            
            // 2. Move Down
            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;
            
            // 3. Move Left (with boundary check)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) { // Fixed: decrementing i
                    ls.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // 4. Move Up (with boundary check)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) { // Fixed: decrementing i and using 'left'
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ls;
    }
}