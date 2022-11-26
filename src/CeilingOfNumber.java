public class CeilingOfNumber {
    // program to find a ceiling of a number in an array.
    // I/P sorted array
    // o/p ceiling of a number
    public static int ceiling(int[] arr,int target,int n){
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid =  start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12};
        int target = 8;
        System.out.println(ceiling(arr,target,arr.length));
    }

}
