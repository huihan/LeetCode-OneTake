public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int row = matrix.length ; 
        int col = matrix[0].length;
        for(int i = 0 , j = col -1 ; i>=0&&j>=0&&i<row&&j<col ; ){
            
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target) i++;
            else if(matrix[i][j] > target) j--;
        }
        return true;
    }
}
