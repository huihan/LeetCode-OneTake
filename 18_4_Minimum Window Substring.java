public class Solution {
    public String minWindow(String S, String T) {
         Machine box = new Machine(S,T);
         for(int i = 0 ; i < S.length() ; i++){
            if(box.push(i))
              box.pop();
         } 
         return (box.needToFindCount == 0)? S.substring(box.minBegin,box.minBegin + box.minWindowWidth +1):"";
    }
}

class Machine{
    String S ;
    int[] needToFind;
    int[] hasFound;
    int begin;
    int end;
    int minWindowWidth;
    int minBegin;
    int needToFindCount;
    public Machine(String s, String t){
        S = s;
        needToFind = new int[256];
        hasFound = new int[256];
        Arrays.fill(needToFind , 0);
        Arrays.fill(hasFound , 0);
        for(int i = 0 ; i< t.length() ; i++)
          needToFind[t.charAt(i)]++;
          begin = 0;
          end = 0 ;
          minWindowWidth = Integer.MAX_VALUE;
          minBegin = 0;
        needToFindCount = t.length();
    }
    public boolean push(int index){
      end = index;
      if( hasFound[S.charAt(index)] < needToFind[S.charAt(index)] ) 
        needToFindCount--; 
      hasFound[S.charAt(index)]++;
      if(needToFindCount==0) refreshWidth(begin, end - begin);
      return (needToFindCount==0)?true:false;
    }
    public void pop(){
      while(hasFound[S.charAt(begin)] > needToFind[S.charAt(begin)] ) 
      {
        hasFound[S.charAt(begin++)]--; 
        refreshWidth(begin, end - begin);
      }
    }
    public void refreshWidth(int start , int width){
      if(minWindowWidth > width){
        minWindowWidth = width;
        minBegin = start;
      }
    }
}
