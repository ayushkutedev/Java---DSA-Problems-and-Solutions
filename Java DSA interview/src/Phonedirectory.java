import java.util.HashMap;
import java.util.Scanner;

public class Phonedirectory {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Phone Directory ---");
            System.out.println("1. Add/Update Contact");
            System.out.println("2. Find Number by Name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact saved successfully!");
                    break;

                case 2:
                    System.out.print("Enter name to find: ");
                    String searchName = sc.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Phone number: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
