public class Solution {
    String w1;
    String w2;
    int row ;
    int col;
    public int minDistance(String word1, String word2) {
        w1 = word1;
        w2 = word2;
        row = word1.length();
        col = word2.length();
        int[][] matrix  = new int[row+1][col+1];
        for(int i = 0 ; i <= row ; i++){
            Arrays.fill(matrix[i] , -1);
        }
        return solve(matrix,0,0);
    }
    public int solve(int[][] matrix , int r , int c){
        if(r == row && c == col) return 0; 
        if(matrix[r][c] != -1) return matrix[r][c];
        if(r == row ) return solve(matrix , r , c +1)  +1;
        if(c == col ) return solve(matrix , r+1 , c)+1;
        int res = Integer.MIN_VALUE;
        res = Math.min( solve(matrix , r+1 , c),solve(matrix  , r , c+1) ) +1;
        int tem =solve(matrix , r+1,c+1);
        if(w1.charAt(r) == w2.charAt(c))
            res= Math.min(res , tem);
        else
            res= Math.min(res , tem+1);
        matrix[r][c] = res;
        return res;
    }
}
