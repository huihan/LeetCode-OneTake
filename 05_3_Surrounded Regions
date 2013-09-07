Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region .

For example,

X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X

  class Point{
  int x,y;
  public Point(int X, int Y){
    this.x = X;
    this.y = Y;
  }
}
public class Solution{
  public void solve (char[][] board){
    if(board.length < 1) return;
    int row = board.length;
    int column = board[0].length;
    if(row*column <= 4) return;
    Queue<Point> qe = new LinkedList<Point>();
    for(int j = 0  ; j < column ; j++){
      if(board[0][j] == 'O') qe.offer(new Point(0,j) );
      if(board[row-1][j] == 'O') qe.offer(new Point(row-1,j) ); 
    } 
    for(int i = 1  ; i < row-1 ; i++){
      if(board[i][0] == 'O') qe.offer(new Point(i,0) );
      if(board[i][column-1] == 'O') qe.offer(new Point(i,column-1) ); 
    }
    while(!qe.isEmpty()) //problem
    {
       Point now = qe.poll();
       if(board[now.x][now.y] == 'T') continue;
       board[now.x][now.y] =  'T';
       if(check(now.x-1,now.y  , row,column)) {
          if(board[now.x-1][now.y] == 'O')
            qe.offer(new Point(now.x-1,now.y));
       }
       if(check(now.x+1,now.y  , row,column)) {
          if(board[now.x+1][now.y] == 'O')
            qe.offer(new Point(now.x+1,now.y));
       }
       if(check(now.x,now.y-1  , row,column)) {
          if(board[now.x ][now.y-1] == 'O')
            qe.offer(new Point(now.x ,now.y-1));
       }
       if(check(now.x,now.y+1  , row,column)) {
          if(board[now.x ][now.y+1 ] == 'O')
            qe.offer(new Point(now.x ,now.y+1 ));
       }
    }
      for(int i = 0 ;i < row ; i++)
          for(int j = 0 ; j < column ; j++){
            if(board[i][j] == 'O') board[i][j] = 'X';
            else if(board[i][j] == 'T')
            board[i][j] = 'O';
        } 
  }
  public boolean check(int x,int y,int row,int column){
    if(x<0 || y<0) return false;
    if(x>=row || y>=column) return false;
    return true;
  }
}







public class Solution {
    public void solve(char[][] board) {
        if(board.length < 1) return;
        int row = board.length;
        int column = board[0].length;
        if(row * column <=4) return;
        for(int j = 0  ; j < column ; j++){
          check(board , 0 , j);
          check(board, row-1 , j);
        } 
        for(int i = 1  ; i < row ; i++){
          check(board , i , 0);
          check(board, i , column-1);
        }
        for(int i = 0 ;i < row ; i++)
          for(int j = 0 ; j < row ; j++){
            if(board[i][j] == 'O') board[i][j] = 'X';
            else if(board[i][j] == 'T')
            board[i][j] = 'O';
        } 
    }
    public void check(char[][] board , int x , int y){
        if(board.length < 1) return;
        int row = board.length;
        int column = board[0].length;
        if(x<0 || y<0 || x>= row || y>= column){
          return;
        }
        if(board[x][y] == 'X' || board[x][y] == 'T') return;
        if(board[x][y] == 'O') board[x][y] = 'T';
        check(board , x , y+1);
        check(board , x+1 , y);
        check(board , x-1 , y);
        check(board , x , y-1);
    }
}
