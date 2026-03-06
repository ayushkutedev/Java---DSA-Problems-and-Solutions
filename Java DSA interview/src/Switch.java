import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){

            case "mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
            case "orange":
                System.out.println("a round fruit with orange color" );
                break;
            case "Banana":
                System.out.println("Yellow color");
                break;
            case "Grape":
                System.out.println("Small Fruits");
                break;
            default:
                 System.out.println("Please Enter a Valid food");
        }
    }

}
