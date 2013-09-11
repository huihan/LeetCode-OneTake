public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = m + n;
        m--;
        n--;
        for(int i = len -1 ; i>=0 ; i--){
            if(m >= 0 && n >=0){
                if(A[m] >= B[n]) {
                    A[i] = A[m];
                    m--;
                }
                else {
                    A[i] = B[n];
                    n--;
                }
            }
            else if(m>=0) {
                A[i]= A[m];
                m--;
            }
            else{
                A[i]= B[n];
                n--;
            } 
        }
    }
}
