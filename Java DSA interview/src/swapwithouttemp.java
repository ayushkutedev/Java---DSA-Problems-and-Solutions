public class swapwithouttemp {
    public static void main(String args[])
    {
        int a = 90;
        int b = 44;

        System.out.println("Before Swapping a = " + a);
        System.out.println("Before Swapping b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After  Swapping: a  = " + a);
        System.out.println("After Swapping:  b  = " + b);
    }
}
