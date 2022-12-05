import java.util.Arrays;

public class selectionSortAlgo {
    public static void selection(int[] arr){
        int start=0;
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,start,last);
            swap(arr,maxIndex,last);
        }
    }
    public static int getMaxIndex(int[] arr,int first,int end){
        int max = first;
        for(int i=first;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,9,3,5,2,10};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
