public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(numRows==0) return res;
        ArrayList<Integer> tem =new ArrayList<Integer>();
        tem.add(1);
        res.add(tem);
        for(int i = 2 ;  i <= numRows ; i++){
          tem =new ArrayList<Integer>();
          tem.add(1);
          for(int j = 1 ; j < i-1 ; j++){
            tem.add( res.get( i-2 ).get(j)+res.get( i-2 ).get(j-1) );
          }
          tem.add(1);
          res.add(tem);
        }
        return res;
    }
}
