public class Solution {
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean mark_row = false;
        boolean mark_col = false;
        for(int j = 1 ; j < col ; j++)
            if(matrix[0][j] == 0){
                mark_col = true; 
            }
        
        for(int i = 1 ; i < row ; i++)
            if(matrix[i][0] == 0){
                mark_row = true;
            }
        for(int i = 1 ; i < row ; i++)
            for(int j = 1; j < col ; j++){
                if(matrix[i][j] == 0) 
                {
                    matrix[0][j] =0;
                    matrix[i][0] =0;
                }
            }
        for(int i = 1 ; i < row ; i++)
            if(matrix[i][0] == 0){ 
                for(int j = 1 ; j < col ; j++)
                    matrix[i][j] = 0;
            } 
        for(int j = 1 ; j < col ; j++)
            if(matrix[0][j] == 0){ 
                for(int i = 1 ; i< row ; i++)
                    matrix[i][j] = 0;
            }
        if(matrix[0][0] == 0){ 
            for(int i = 1 ; i < row ; i++)
                matrix[i][0] = 0;
            for(int j = 1 ; j < col ; j++)
                matrix[0][j] = 0;
        }
        
        if(mark_row) {
            for(int i = 0 ; i < row ; i++)
                matrix[i][0] = 0; 
        }
        if(mark_col) {
             for(int j = 0 ; j < col ; j++)
                matrix[0][j] = 0;
           
         }
    }
} 
