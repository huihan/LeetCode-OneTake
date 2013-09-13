public class Solution {
    public String minWindow(String S, String T) {
       Machine box = new Machine(T,S);
       for(int i = 0 ; i < S.length() ; i++)
          if(box.push( i , S.charAt(i)))
              while(box.pop());
      return (box.minWindowWidth == Integer.MAX_VALUE)? "":   Integer.toString(box.minWindowWidth);
      // return (box.minWindowWidth == Integer.MAX_VALUE)? "":S.substring(box.minStart ,box.minStart +box.minWindowWidth);
    }
}
class Machine{
  
  int[] needToFind;
  int[] hasFound;
  int minWindowBegin;
  int minWindowEnd;
  int minWindowWidth;
  int minStart;
  int charCount;
  String S;
  
  public Machine(String T , String str){
    needToFind = new int[256];
    hasFound = new int[256];
    Arrays.fill(needToFind , 0);
    Arrays.fill(hasFound , 0);
    for(int i = 0 ; i < T.length() ; i++) 
      needToFind[T.charAt(i)]++;
    
     minWindowBegin = 0;
     minWindowEnd= 0;
     minWindowWidth= Integer.MAX_VALUE;
     charCount = T.length();
     minStart = 0;
     S = str;
  }
  public boolean push(int index , char c){
     if(hasFound[c] < needToFind[c]){
        hasFound[c]++;
        charCount--;
        minWindowBegin = Math.min(minWindowBegin, index);
        minWindowEnd = Math.max(minWindowEnd,index);
     }
     else hasFound[c]++;
     if(charCount == 0){
         refreshWidth(minWindowEnd - minWindowBegin , minWindowBegin);  
        return true;
     }
     return false;
  }
  public boolean pop(){
    if(hasFound[S.charAt(minWindowBegin)] > needToFind[S.charAt(minWindowBegin)]  ){
        hasFound[S.charAt(minWindowBegin++)]--; 
        refreshWidth(minWindowEnd - minWindowBegin , minWindowBegin);  
        return true;
    }
    return false;
  }
  public void refreshWidth(int k, int index){
      if(minWindowWidth > k) {
          minWindowWidth = k;
          minStart = index;
      }
  }
}
