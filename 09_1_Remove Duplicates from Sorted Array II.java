public class Solution {
    public int removeDuplicates(int[] A) { 
        int len = A.length;
        if(len <=2) return len;
        int gun = len -1;
        int shield = len -1;
        for(  gun = len - 1 ; gun>=2 ; gun--){
          if(A[gun-1] == A[gun-2] && A[gun] == A[gun-1]) continue; 
          A[shield--] = A[gun]; 
        } 
        A[shield--] = A[gun--]; 
        A[shield] = A[gun];
        int count = len - shield ;
        for(int i = 0 ; i < count ;i++ )
          A[i] = A[shield++];
        return count;
    }
}
