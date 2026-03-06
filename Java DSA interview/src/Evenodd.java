import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = in.nextInt();
        if(number % 2==0) {
            System.out.println("Its even number");

        }
        else{
            System.out.println("Its odd number");
        }
    }
}
