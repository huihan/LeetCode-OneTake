public class Solution {
    public boolean search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return solve(A, 0 , A.length -1, target);
    }
    public boolean solve(int[] A , int start , int end , int target){
        if(start > end) return false;
        if(A[start] == target) return true;
        if(A[end] == target) return true;
        if(A[start] == A[end]) return solve(A,start+1,end-1,target);
        if(A[start] < A[end]) return binarySearch(A,start,end ,target);
        int mid = (start+end)/2;
        if(A[mid] == target) return true;
        if(A[mid] == A[start]) return solve(A, mid+1 , end-1 , target);
        if(A[mid] == A[end]) return solve(A, start+1 , mid-1 , target);
        if(target > A[mid])
        { 
          if(target > A[end] &&A[mid] < A[start]) return solve(A,start+1 , mid-1,target);
          return solve(A,mid+1 , end-1,target);
        }
        if(target<A[start] && A[mid]>A[start]) return solve(A,mid+1 , end-1,target);
        return solve(A,start+1 , mid-1,target);
    }
    public boolean binarySearch(int[] A , int start , int end , int target){
        if(start > end) return false;
        if(start == end) return A[start]==target;
        int mid = (start+end)/2;
        if(A[mid] == target) return true;
        if(A[mid] > target) return binarySearch(A,start,mid-1 ,target);
        if(A[mid] < target) return binarySearch(A,mid+1,end ,target);
        return false;
    }
}
