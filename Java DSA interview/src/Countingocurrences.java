public class Countingocurrences {
    public static void main(String[] args) {
        int n = 4226283;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 2) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}

/*
Logic of this line : - n = n / 10;
Let's break it down with a simple example:

Imagine the number 1234.

Step 1: Divide 1234 by 10. You get 123.4.
In integer division (which is what Java uses for whole numbers), we drop everything after the decimal point.

Result: Instead of 123.4, you just get 123.
So, when you divide 1234 by 10, the last digit (4) is removed, and you're left with 123.

Now, let's apply this to the number in your program:

If n is 4556785 and you divide it by 10, you get 455678.5.
In integer division, this becomes just 455678, effectively removing the last digit 5.
This process repeats in the loop, removing the last digit each time until all digits are processed.
 */

/*
We use 10 because we are dealing with a number in the decimal system (base-10).
Dividing by 10 works because it directly corresponds to the structure of numbers in this system,
allowing us to remove the last digit easily.
 */
