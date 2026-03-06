package Arrays;

import java.util.Scanner;

public class ArrayLinearsearch {
    public static void main(String[] args) {
        int[] arr = {23,45,32,56,75};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search : ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==search){
                System.out.println(search + " Found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(search + " Not Found in the array pls check the input !!!!! ");
        }


    }
}
