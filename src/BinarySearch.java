public class BinarySearch {
    // Binary search algorithm
    // Worst case time complexity O(logn)
    // Array should be sorted
    public static int searchB(int[] arr,int target,int n){
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}
