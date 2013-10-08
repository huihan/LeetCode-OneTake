public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = grid.length;
        if(m ==0) return 0;
        int n = grid[0].length;
        if(n == 0) return 0; 
        return solve(grid   , 0 ,0);
    }
    int solve (int[][] grid,  int a , int b){ 
        int m = grid.length; 
        int n = grid[0].length;
        if( a ==  m || b == n) return Integer.MAX_VALUE;
        if(a == m-1 && b == n-1) return grid[a][b];
        return grid[a][b] + Math.min(solve(grid,a+1,b) , solve(grid,a ,b+1));
    }
}
