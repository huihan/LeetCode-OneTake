public class Solution {
    public boolean exist(char[][] board, String word) { 
        if(word.length() < 1) return true;
        if(board.length <1 || board[0].length<1) return false;
        int height  = board.length , width = board[0].length;
        boolean[][] map = new boolean[height][width];
        for(int i = 0 ; i < height ; i++) Arrays.fill(map[i],false);
        for(int i = 0 ; i < height ; i++)
          for(int j = 0 ; j < width ; j++)
            if(solve(board , word , 0 , i , j, map)) return true;
        return false;    
    }
    public boolean solve(char[][] board , String word , int index , int row , int col , boolean[][] map){ 
        int height  = board.length , width = board[0].length;
        int len = word.length();
        if(index >= len ) return true;
        if(row >= height || row < 0 || col >= width || col < 0 ) return false;
        if(map[row][col] ==  true) return false;
        if(board[row][col] != word.charAt(index))  return false;
        map[row][col] =  true;
        boolean a = solve(board,word,index+1  , row-1 , col , map);
        boolean b = solve(board,word,index+1  , row+1 , col , map);
        boolean c = solve(board,word,index+1  , row , col+1 , map);
        boolean d = solve(board,word,index+1  , row , col-1 , map);
        map[row][col] = false;
        return a||b||c||d;
    }
}
