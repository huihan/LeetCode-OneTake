 
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int len = preorder.length;
        return buildTree_DP(preorder , 0 , len -1 ,inorder , 0, len-1);
        
    }
    
    public TreeNode buildTree_DP(int[] pre , int a1, int b1 , int[] in , int a2 , int b2){
        if(a1 > b1) return null;
        if(a1 == b1) return new TreeNode(pre[a1]);
        
        int mid = pre[a1];
        TreeNode root = new TreeNode(mid);
        int index = search(in , a2,b2,mid);
        root.left  = buildTree_DP(pre  , a1+1 ,  a1+index-a2  ,   in ,  a2 , index -1 );
        root.right = buildTree_DP(pre , b1+ index+1-b2 ,  b1  ,   in ,  index+1 , b2 );
        return root;
    }
    public int search(int[] arr , int a , int b , int tar){
      for(int i = a ; i <=b ; i++){
          if(arr[i] == tar) return i;
      }
      return a;
    }
    
}
