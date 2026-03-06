package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayofobjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] sc = new String[5];
        for (int i = 0; i < sc.length; i++) {
            sc[i] = in.next();


            System.out.println(Arrays.toString(sc));

        }
    }
    }


