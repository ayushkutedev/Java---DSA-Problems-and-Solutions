public class Typecasting {
    public static void main(String args[])
    {
        //int number = 'A';
        //System.out.println(number);
        byte b = 42;
        char c = 'A';
        short s = 2456;
        int i = 40000;
        float f = 57.8f;
        double d = 0.9685;
        //1) byte is getting promoted into f and the output is in Float
        //2) char is getting promoted into int and the output is in Integer
        //
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " "+(i / c) + " " + (d * s));
        System.out.println(result);





    }

}
