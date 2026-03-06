package Arrays;

public class MaxNumberinArrayRange {
    //Find a maximum number in array in a given range
    public static void main(String[] args) {
        int[] arr = {3, 12, 5, 2, 9};
        System.out.println(maxrange(arr, 1 , 3));
    }
    static int maxrange(int[] arr, int start , int end){
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
