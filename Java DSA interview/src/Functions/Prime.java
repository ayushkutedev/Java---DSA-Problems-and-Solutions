package Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if(n % c == 0){


                return false;

            }
            c++;
        }
        if (c * c > n){
            return true;
        }
        return false;
    }
}
















/*
A prime number is a number greater than 1 that has no divisors other than 1 and itself.
In other words, it can't be divided evenly by any other numbers.

Example:

5 is a prime number because it can only be divided by 1 and 5.
6 is not a prime number because it can be divided by 1, 2, 3, and 6.
 */