package Arrays;

public class Averageofarr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;

        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
            double average =  sum / arr.length;

            System.out.println("Sum of Array : " + sum);
            System.out.println("Sum of Average : " + average);

        }
    }

