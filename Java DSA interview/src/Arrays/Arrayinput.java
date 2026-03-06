package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        //Input using for loop
        System.out.println("Enter 5 values : ");
        for (int i = 0; i < arr.length; i++) {    //arr.length gives the total number of elements in the array arr.

            arr[i] = in.nextInt(); // this is 1st method to print the array
        }
        System.out.println("Array After input : ");
        System.out.println(Arrays.toString(arr)); // this is 2nd method to print the array
    }
}
