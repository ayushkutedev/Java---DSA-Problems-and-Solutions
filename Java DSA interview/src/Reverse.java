import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to Reverse : ");
        int n = scanner.nextInt();


        int ans = 0;

        while (n > 0) {

            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);

    }
}

/*
When you multiply any number by 0, the result is always 0.
So:10×0=0
 */

/*
Initialization:

int n = 7438;: This is the number we want to reverse.
int ans = 0;: This variable will store the reversed number. It starts at 0.
While Loop:

while (n > 0) {: This loop continues to execute as long as n is greater than 0.
Inside the Loop:

int rem = n % 10;: This gets the last digit of n. In the first iteration, if n is 7438, rem will be 8.
n /= 10;: This removes the last digit from n. After removing 8, n becomes 743.
ans = ans * 10 + rem;: This appends the last digit to ans. Initially, ans is 0. After the first iteration, ans becomes 8.
Loop Iterations:

First Iteration:
n = 7438, rem = 8, ans = 0 * 10 + 8 = 8, n becomes 743.
Second Iteration:
n = 743, rem = 3, ans = 8 * 10 + 3 = 83, n becomes 74.
Third Iteration:
n = 74, rem = 4, ans = 83 * 10 + 4 = 834, n becomes 7.
Fourth Iteration:
n = 7, rem = 7, ans = 834 * 10 + 7 = 8347, n becomes 0.
End of Loop:

The loop stops because n is now 0.
Output:

System.out.println(ans);: The program prints the reversed number, which is 8347.
 */
