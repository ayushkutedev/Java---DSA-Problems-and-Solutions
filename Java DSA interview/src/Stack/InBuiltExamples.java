package Stack;

import java.util.Stack;

public class InBuiltExamples {

    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(44);
        stack.push(42);
        stack.push(21);
        stack.push(74);
        stack.push(84);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }

}
