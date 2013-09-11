public class Solution {
    public int largestRectangleArea(int[] height) {
        
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
