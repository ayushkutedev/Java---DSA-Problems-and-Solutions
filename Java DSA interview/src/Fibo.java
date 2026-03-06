import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
}

/*
Initial Setup

a = 0 (This is the 1st Fibonacci number)
b = 1 (This is the 2nd Fibonacci number)
count = 2 (We start counting from the 3rd position)

First Loop Iteration (count = 2)

temp = b = 1 (Store the value of b)
b = b + a = 1 + 0 = 1 (Calculate the next Fibonacci number)
a = temp = 1 (Update a to the previous value of b)
count = 3 (Move to the next position)

Second Loop Iteration (count = 3)

temp = b = 1 (Store the value of b)
b = b + a = 1 + 1 = 2 (Calculate the next Fibonacci number)
a = temp = 1 (Update a to the previous value of b)
count = 4 (Move to the next position)

Third Loop Iteration (count = 4)

temp = b = 2 (Store the value of b)
b = b + a = 2 + 1 = 3 (Calculate the next Fibonacci number)
a = temp = 2 (Update a to the previous value of b)
count = 5 (Move to the next position)


 */
