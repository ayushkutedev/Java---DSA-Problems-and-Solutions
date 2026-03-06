package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;



public class Varargs {

    public static void main(String[] args) {
        fun(2,3,6,7,7,6,5,4);

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }


}