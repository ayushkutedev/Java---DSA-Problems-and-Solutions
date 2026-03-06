package Arrays;

import java.util.Arrays;

public class Copyarrintoanother {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int[] copy = new int[arr.length];

        System.out.println("Orignal Array : ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            copy[i] = arr[i];


        }

        System.out.println("Copied Array");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");

        }
    }
}