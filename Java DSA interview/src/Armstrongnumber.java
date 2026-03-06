public class Armstrongnumber {
    public static void main(String[] args) {


    int num = 153;
    int orignal = num;
    int sum = 0;


    int digits = String.valueOf(num).length();
    /*
    This line finds out how many digits are in the given number. Here’s how:
    String.valueOf(num
    Converts the number into a string.
    If num = 153, it becomes "153".
    .length()
    Returns the number of characters in that string.
    "153".length() equals 3, since there are three digits.
     digits equals the number of digits in num.
     */


    while (num > 0) {
        int digit = num % 10;  //Get last digit
        sum += Math.pow(digit, digits);
        num = num / 10;
    }

    /*
     int digit = num % 10;
    This gets the last digit of the number.
    % is modulus operator — it gives the remainder
    So:
    153 % 10 = 3 → last digit is 3
    Then 15 % 10 = 5 → next is 5
    Then 1 % 10 = 1 → final digit is 1


    Math.pow(digit, digits) raises the digit to the power of the number of digits.

    += adds that to sum

    Example for 153:

    First digit: 3^3 = 27 → sum = 27

    Second digit: 5^3 = 125 → sum = 27 + 125 = 152

    Third digit: 1^3 = 1 → sum = 152 + 1 = 153


     */

    if(sum==orignal){
        System.out.println(orignal + " The number is an Armstrong number ");

    }else {
        System.out.println(orignal + " The number is NOT an Armstrong number ");
    }

    }
}