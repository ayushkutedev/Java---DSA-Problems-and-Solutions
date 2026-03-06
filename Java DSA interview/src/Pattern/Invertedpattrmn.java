    package Pattern;

    public class Invertedpattrmn {
        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j < i; j++) {       // Thia for is for space
                    System.out.print(" ");
                }

                for (int k = 1; k <= rows - i + 1 ; k++) {
                    System.out.print("*");

                }
                System.out.println();


            }
        }
    }
