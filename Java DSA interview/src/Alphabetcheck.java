import java.util.Scanner;

public class Alphabetcheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Alphabet in any case : ");
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
