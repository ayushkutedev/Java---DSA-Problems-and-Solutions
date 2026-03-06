import java.util.Scanner;

public class Div6 {
    //Check a number is divisible by 6 or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number % 6 == 0 ) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");

        }
    }
}
