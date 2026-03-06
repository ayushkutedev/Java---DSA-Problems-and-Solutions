package Arrays;

import java.util.Arrays;

public class MaxNumberinArray {
    //create the array and find maximum
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 22};
        System.out.println(max(arr));

    }
        static int max(int[] arr)
        {
                //Let's assume 1 is max here
                int max = arr[0];
            for (int i = 1; i < arr.length; i++)
            {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }


}
