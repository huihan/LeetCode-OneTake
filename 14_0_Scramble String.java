public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int lena = s1.length();
        int lenb = s2.length();
        if(lena != lenb) return false;
        if(lena == 0||s1.equals(s2)) return true;
        char[] crr1 = s1.toCharArray();
        char[] crr2 = s2.toCharArray();
        Arrays.sort(crr1);
        Arrays.sort(crr2);
        if(!Arrays.equals(crr1,crr2)) return false;
        
        int i = 1; 
        while(i< lena){
            String a1 = s1.substring(0,i);
            String b1 = s1.substring(i);
            String a2 = s2.substring(0,i);
            String b2 = s2.substring(i);
            if(isScramble(a1,a2) && isScramble(b1,b2)) return true;
            String a3 = s2.substring(lenb - i);
            String b3 = s2.substring(0, lenb-i);
            if(isScramble(a1,a3) && isScramble(b1,b3)) return true;
            i++;
        }
        return false;
    }
}
