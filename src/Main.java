public class Main {

    //  kadane's algorythm to find maximum subarray in an array .
    public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr));
    }
    public static int maxSubarray(int[] arr){
        int sum =0;
        int maxi = arr[0];
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          maxi = Math.max(maxi,sum);
          if(sum<0)
              sum=0;
        }
        return maxi;
    }
}