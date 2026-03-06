package Arrays;

import java.util.Arrays;

public class ArayPassinginfunction {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0] = 4;

    }
}
