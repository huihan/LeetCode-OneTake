public class Solution {
    public void sortColors(int[] A) {
         int len = A.length; 
         for(int i = 0, begin = -1, end = len ; i < end ; i++){
            if(A[i] == 0 ) exchange(A, ++begin , i);
            if(A[i] == 2 ) exchange(A, i-- , --end);
         } 
    }
    public void exchange(int[] A  ,int a , int b){
      int tem = A[a];
      A[a] = A[b];
      A[b] = tem;
    }
}
