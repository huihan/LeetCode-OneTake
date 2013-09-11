public class Solution {
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() == 0) return 0;
        return solve(s,0);
    }
    public int solve(String s , int index){
        int len = s.length();
        if(index>=len) return 0;
        int res = 0;
        int k = cutString(s,index);
        for(int i = 0 ; i < k ; i++){
            res += solve(s,index+i+1);
        }
        return res;
    }
    public int cutString(String s, int index){
        char a = s.charAt(index);
        if(a == '0') return 0;
        if(index == s.length()-1) return 1;
        if(a == '1') return 2;
        if(a == '2' && charAt(index+1) < '7' ) return 2;
        return 1;
    }
}
