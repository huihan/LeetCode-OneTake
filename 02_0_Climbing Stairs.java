public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n <=2) return n;
        int a = 1,b = 2,k=2;
        while( k++ < n){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
