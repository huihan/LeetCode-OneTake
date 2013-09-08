public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle == null) return 0;
        int len = triangle.size();
        if(len < 1) return 0;
        return minimumTotal_DP(triangle , 0,0);
    }
    public int minimumTotal_DP(ArrayList<ArrayList<Integer>>  triangle , int row , int column){
        int len = triangle.size();
        if(row == len -1)
            return triangle.get(row).get(column);
        return triangle.get(row).get(column)+ 
                Math.min(minimumTotal_DP(triangle , row+1,column) 
                ,minimumTotal_DP(triangle , row+1,column+1) );
    }
}
