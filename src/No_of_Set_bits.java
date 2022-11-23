public class No_of_Set_bits {
    // wap to find the no of set bits in a number.
    public static int noOfSet(int n){
        int count=0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noOfSet(9));
    }
}
