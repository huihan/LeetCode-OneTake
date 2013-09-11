public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(n == 0)
        {
            res.add(0); 
            return res;
        }
        ArrayList<Integer> next = grayCode(n-1);
        for(int i = next.size()-1 ; i >=0  ; i--){
            next.add((1<<(n-1)) + next.get(i ) ); //  << take car of n-1
        }
        return next;
    }
}
