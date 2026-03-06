import java.util.Scanner;
public class StrongNumber {
    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

        static boolean isStrong(int num)
        {
            int original = num;
            int sum = 0;

            while (num > 0) {
                int d = num % 10;
                sum += factorial(d);
                num /= 10;
            }
            return sum == original;
        }

        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a numeber :");
            int n = sc.nextInt();

            System.out.println(n + (isStrong(n) ? " is a strong number." : "is not a Strong number."));


        }


    }



