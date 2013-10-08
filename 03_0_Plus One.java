public class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        if(len == 0) return new int[]{1}; 
        for(int i = len -1 ; i >=0  ; i--){
            if(digits[i] == 9){ digits[i] = 0; continue;}
            digits[i] +=1;
            return digits;
        }
        int[] arr = new int[len+1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        return arr;
    }
}
