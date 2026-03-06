package Arrays;

public class Countevenodd {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,7,9,4,5,6,4,3,2,2};
        int evencount = 0;
        int oddcount = 0;


        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evencount++;

            }else {
                oddcount++;
            }

        }
        System.out.println("Even number : " + evencount);
        System.out.println("Odd number : " + oddcount);



    }

}
