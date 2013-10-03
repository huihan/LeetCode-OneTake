public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int len = numbers.length;
        Num[] arr = new Num[len];
        int[] res = new int[2];
        
        for(int i =1 ; i <=len ; i++){
          arr[i-1] = new Num(numbers[i-1] , i) ;
        }
        Arrays.sort(arr , Num.com);
        int p = 0  , q = len -1;
        while(p<q){
          int t = arr[p].getVal() + arr[q].getVal();
          if(t == target){
            res[0] = Math.min(arr[p].getIndex(),arr[q].getIndex());
            res[1] = Math.max(arr[p].getIndex(),arr[q].getIndex());
            return res;
          }
          if(t > target){
            q--;
          }
          else p++;
        }
        return res;
    }
    
   
}
   class Num {
      
        private int index;
        private int data;
        
        static Comparator<Num> com = new Comparator<Num>(){
          @Override
          public int compare(Num a , Num b){
            if(a.data > b.data) return 1;
            if(a.data < b.data) return -1;
            return 0;
          }
        };
        
        public Num(int num , int index){
          this.index = index;
          this.data = num;
        }
        public int getVal(){
          return data;
        }
        public int getIndex(){
          return index;
        }
    }
