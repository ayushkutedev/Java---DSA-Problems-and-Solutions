package Arrays;

public class SumofArray {
    public static void main(String args[])
    {
        int[] arr = {12,34,45,65,76};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];

        }
        System.out.println("Sum of Array elementns : " + sum);
    }   
}
