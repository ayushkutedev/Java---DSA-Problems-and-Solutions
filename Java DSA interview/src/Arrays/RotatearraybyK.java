package Arrays;

import java.util.Arrays;

public class RotatearraybyK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        k = k % arr.length;

        for(int j = 0; j < k; j++){
            int first = arr[0];
            for (int i = 0; i < arr.length -1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
        }
        System.out.println(" Array After " + k + " Left rotation " + Arrays.toString(arr));
    }
}
