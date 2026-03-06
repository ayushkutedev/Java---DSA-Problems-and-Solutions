import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Year :");
        int year = scanner.nextInt();

        boolean isLeapyear = false;

        if(year % 4 == 0)
        {
            if(year % 100 !=0 || year % 400 == 0)
            {
                isLeapyear = true;
            }
        }

        if(isLeapyear){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
