public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int lena = A.length;
        int lenb = B.length;
        if((lena + lenb) % 2 == 0) return (solve(A, 0 , lena -1 , B, 0 ,lenb -1  , (lena+lenb)/2 -1 ) 
                                        +  solve(A, 0 , lena -1 , B, 0 ,lenb -1  , (lena+lenb)/2 ) )/2;
        return solve(A, 0 , lena -1 , B, 0 ,lenb -1  , (lena+lenb)/2 );
    }
    public int solve(int A[] ,int a ,int b , int B[] ,int c ,int d ,int index){
        if(b -a < d -c) return solve(B,c,d , A, a,b,index);
        if(c > d) return  A[a+index]; 
        if(index == 0) return Math.min(A[a] , B[c]);
        int da = index/2;
        int db = index - da;
        if(db > d-c){
            db = d-c;
            da = index - db;
        }
        if( A[a + da] == B[c + db]) return A[a+da];
        if( A[a + da] >  B[c + db]) return solve(A,a, b, B , c+db ,d ,index - db);
        return solve(A,a+da +1 , b, B , d, d , index - da -1);
    }
    
}
