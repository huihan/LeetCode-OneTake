public class Solution {
    private int start;
    private int length ;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len == 0) return "";
        boolean[][] matrix = new boolean[len][len];
        solve(matrix , s);
        return s.substring(start,start+length);
    }
    private void solve(boolean[][] matrix , String s)
    {
        start = 0;
        length = 1;
        int len = matrix.length;
        
        for(int i = 0 ; i < len ; i++){
            Arrays.fill(matrix[i],false);
            matrix[i][i] = true;
        }
        
        for(int d = 1 ; d < len  ; d++)
            for(int i = 0 ; i < len-d ; i++){
                
                if(s.charAt(i) == s.charAt(i+d))
                    if(  matrix[i+1][i+d-1]   || (d < 2)){
                        matrix[i][i+d]= true;
                        refresh(i,d);
                    }
            }
    }
    private void refresh(int i , int d){
        if(length > d +1) return;
        length = d+1;
        start = i;
    }
}
