public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        if(row == 0) return 0;
        int col = matrix[0].length;
        if(col == 0 ) return 0;
        
        int[][] arrs = new int[row][col];
        for(int j = 0 ; j< col ; j++){
          if(matrix[0][j] == '0') arrs[0][j] = 0;
          else if(matrix[0][j] == '1') arrs[0][j] = 1;
        }
        for(int i = 1 ; i < row ; i++){
          for(int j = 0 ; j < col ; j++){
            if(matrix[i][j] == '0') arrs[i][j] = 0;
            else if(matrix[i][j] == '1') arrs[i][j] = 1 + arrs[i-1][j];
          }
        }
        int res= 0; 
        for(int[] arr :  arrs) res = Math.max(res , maxRectLine(arr));
        return res;
    }
    public int maxRectLine(int[] arr){
      int area = 0,border = 0;
      Stack<Node> st = new Stack<Node>();
      st.push(new Node(-1, -1));
      for(int i = 0 ; i< arr.length ; i++){
        if(arr[i] >= st.peek().height){
          st.push(new Node(i,arr[i]));
        }
        else{
          Node tNode = st.peek();
          border = tNode.index;
          while(arr[i] < st.peek().height){
            tNode = st.pop();
            area = Math.max(area, (border - st.peek().index)*tNode.height );
          }
          st.push(new Node(i , arr[i]));
        }
      }
      Node tem = st.peek();
      border = tem.index;
      while(st.peek().height > 0){
        tem = st.pop();
        area = Math.max(area , (border - st.peek().index)*tem.height);
      }
      
      return area;
    }
    
}

class Node{
  int index;
  int height;
  public Node(int i , int h){
    this.index = i;
    this.height = h;
  }
}
