public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return solve(1, n , k);
    }
    public ArrayList<ArrayList<Integer>> solve(int start , int n  , int k ){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(k == 0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        if(n - start + 1 < k ) return res;
        
        ArrayList<ArrayList<Integer>> tem1 = solve(start+1, n , k -1);
        ArrayList<ArrayList<Integer>> tem2 = solve(start+1, n , k );
        for(int i = 0 ; i< tem1.size() ; i++){
            tem1.get(i).add(0,start);
        }
        tem1.addAll(tem2);
        return tem1;
    }
}
