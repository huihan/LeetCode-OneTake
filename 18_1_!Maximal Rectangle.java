public class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int row = matrix.length;
        if(row == 0) return 0;
        int column = matrix[0].length;
        if(row * column == 0) return 0;
        for(int j = 0 ; j < column ; j++){
            if(matrix[0][j] == '1') matrix[0][j] = 1;
            else matrix[0][j] = 0;
        }
        for(int i = 1 ; i < row ; i++)
            for(int j = 0 ; j < column ; j++){
                if(matrix[i][j] == '1') matrix[i][j] =(char)( (int)matrix[i-1][j] +1);
                else if(matrix[i][j] == '0') matrix[i][j] = 0;
            }
        int res = 0;
        for(int i = 0 ; i < row ; i++){
            res = Math.max(res, largestRectangleArea(matrix[i]));
        }
        return res;
    }
    public int largestRectangleArea(char[] height) {
        
        int area = 0,border ; 
        Stack<Node> heightStack = new Stack<Node>(); 
        heightStack.push( new Node(-1,-1) );
        Node temNode;
        for(int i = 0 ; i < height.length ; i++){
            if( heightStack.peek().height < height[i]){
                heightStack.push(new Node(height[i] , i ));
            }
            else{
                temNode = heightStack.peek();
                border = temNode.index; 
                while(heightStack.peek().height > height[i])
                {
                    temNode = heightStack.pop();
                    area = Math.max( (border - heightStack.peek().index )*temNode.height , area );
                }
                area = Math.max( (i - heightStack.peek().index )*height[i] , area ); 
                heightStack.push(new Node(height[i] , i));
            }
        }
        border = heightStack.peek().index;
        while(!heightStack.empty()){
            Node tem = heightStack.pop();
            if(heightStack.empty()) return area;
            area = Math.max(area, tem.height * (border - heightStack.peek().index   ));
        }
        return area;
    }
}
 

class Node{
    int height;
    int index;
    public Node(int h , int i){
        this.height = h;
        this.index = i;
    }
    
}
