package Arrays;

import java.util.Arrays;

// Rotating Array by 1 poistion only by left
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int first = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = first;
        System.out.println(" Rotated Array ");
        System.out.println(Arrays.toString(arr));
    }
}
