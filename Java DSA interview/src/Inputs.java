import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String name = input.nextLine();
        //System.out.println("Your name is" + name);

        //int a = input.nextInt();
        //System.out.println(a);

        //Q.1) Take a name and Output Hello name
        //System.out.println("Enter your name : ");
        //String name = input.next();
        //System.out.println("Your name is :" + name);

        //Q.2) Take input of a salary.if the salary is greater than 10000 add bounus as
        //2000,otherwise add bonus as 1000.

        //System.out.println("Enter Your Salary : ");
        //int Salary = input.nextInt();
        //if(Salary > 10000)
        //{
        //  Salary += 2000;
        //
        //else {
        //   Salary += 1000;
        //}
        //System.out.println(Salary);


        /*q.4)Take a number as input and print the multiplication table for it
        System.out.println("Enter the Number : ");
        int number = input.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(number*i);
        }*/


        //Q.3)Input a number and print Whether it is prime or not
        //if the number that is Divisible by 1 or number itself then its a Prime no.

        /*System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

         */

        //Q.5)Input a year and find whether it is a leap year or not.
        /*A leap year is a year that has 366 days instead of the usual 365 days.
        The extra day is added to the month of February,
        making it 29 days long instead of 28.
        The year must be evenly divisible by 4. For example,
        2020 is divisible by 4, so it's a leap year.

         */
        System.out.print("Enter a Year : ");
        int year = input.nextInt();
        if (year % 4 == 0 || year % 100 ==0){
            System.out.println("Its a Leap year");
        }
        else
        {
            System.out.println("Its not a Leap year");
        }


    }
}
