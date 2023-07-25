class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start; 
    }
}