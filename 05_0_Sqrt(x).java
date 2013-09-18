public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x <= 1) return x;
        double a = (double)x/2.0;
        double b = 1;
        while( Math.abs(a-b) >= 0.0001)
        {
            a = (x/a + a)/2.0;
            b = x/a;
        }
        return (int)a;
    }
}
