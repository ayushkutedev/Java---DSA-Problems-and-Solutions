import java.util.Scanner;

public class Numoperators {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result = 0;
        System.out.println("Enter any two number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter the operator + , - , * , / : ");
        char  op = in.next().charAt(0);


        if (op == '+')
        {
            result = a + b;
        }
        else if (op == '-')
        {
            result = a - b;
        }
        else if (op == '*')
        {
            result = a * b;
        }
        else if(op == '/'){
            result = a / b;
        }

         System.out.println("The result is : " + result);


    }
}
