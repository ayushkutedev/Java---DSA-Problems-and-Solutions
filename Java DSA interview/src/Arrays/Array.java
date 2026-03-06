package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Syntax:- datatype[] variable_name = new datatype[size];
        int[] rollno = new int[5]; //initialisation: actually here object is being created in the memory (heap)
        // OR
        int[] rollno2 = {23,34,54,65,76};

        System.out.println(rollno2[2]);
        System.out.println(Arrays.toString(rollno2));
    }

}
