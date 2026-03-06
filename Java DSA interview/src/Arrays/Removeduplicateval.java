package Arrays;

public class Removeduplicateval {
    public static void main(String[] args) {
        int[] arr = {5, 10, 5, 20, 10};
        int[] unique = new int[arr.length];
        int index = 0;

        for (int i = 0; i <arr.length ; i++) {
            boolean isDuplicate = false;


            for (int j = 0; j < index; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }

            }

            if (!isDuplicate) {
                unique[index] = arr[i];
                index++;
            }
        }
            System.out.println("After removing Duplicate Array : ");
            for (int i = 0; i < index; i++) {
                System.out.print(unique[i] + " ");
                
            }
        }
    }

