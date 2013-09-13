public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(S);
        int len = S.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer>);
        for(int i = 0 ; i < len ; i++){
            int len_res = res.size();
            for(int j = 0 ; j < len_res ; j++){
                ArrayList<Integer> tem = new ArrayList<Integer>(res.get(j));
                tem.add(S[i]);
                res.add(tem);
            }
        }
        return res;
    }
}
