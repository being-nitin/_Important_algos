public class FloorOfNumber {
    // floor of a number
    public static int floor(int[] arr,int target,int n){
        int end = n-1;
        int start = 0;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        int target = 7;
        System.out.println(floor(arr,target, arr.length));
    }
}
