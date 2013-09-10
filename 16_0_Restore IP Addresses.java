public class Solution {
    ArrayList<String> res ;
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        res = new ArrayList<String>();
        solve(s , 0 , 0 , new ArrayList<Integer>());
        return res;
    }
    public void solve(String s , int index , int count  , ArrayList<Integer> arr){
        if(index >= s.length() ) 
        {
            if( count >=4 )
                res.add(listToString(arr));
            return;
        }
        if( count >=4 )  
            return;
        ArrayList<Integer> cut = getCut(s,index);
        for(int i = 0 ; i< cut.size() ; i++){
            arr.add(cut.get(i));
            solve(s,index+i+1 , count+1 , arr);
            arr.remove(count);
        } 
    }
    public ArrayList<Integer> getCut(String s , int index){
        ArrayList<Integer> cut  = new ArrayList<Integer>();
        if(s.charAt(index) == '0') {
            cut.add(0);
            return cut;
        }
        for(int i = index ; i < index +3 && i < s.length() ; i++){
            int tem = Integer.parseInt( s.substring(index , i+1));
            if(tem > 0 && tem<=255)
                cut.add(tem);
        }
        return cut;
    }
    public String listToString(ArrayList<Integer> arr){
        StringBuffer buf = new StringBuffer();
        for(int i = 0 ; i < arr.size() -1; i++){
            buf.append( arr.get(i).toString() + ".");  // take care append
        }
        buf.append(arr.get(arr.size()-1).toString());
        return buf.toString();
    }
} 







