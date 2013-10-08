public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer buf = new StringBuffer();
        int lena = a.length();
        int lenb = b.length();
        int da = 0 , db = 0 , carry = 0;
        while(lena  > 0 && lenb  > 0){
            lena--;lenb--;
             da = a.charAt(lena ) == '0' ?  0 :   1;
             db = b.charAt(lenb ) == '0' ?  0 :  1;
             int t = da+db+carry;
             buf.insert(0 , t%2==0?'0':'1' );
             carry = t>>1;
        }
        if(lena == 0) a = b;
        lena += lenb;
        while(lena > 0){
            lena--;
            da = a.charAt(lena) == '0'? 0 : 1;
            int t = da + carry;
            buf.insert(0 , t%2==0?'0':'1' );
            carry = t>>1;
        }
        if(carry == 1) buf.insert(0,'1');
        return buf.toString();
    }
}
