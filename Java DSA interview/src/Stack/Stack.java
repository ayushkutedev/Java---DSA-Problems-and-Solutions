package Stack;

public class Stack {
    private int maxSize; //Maximum size of stack
    private int[] stackArray;  //Array to store stack elements;
    private int top; //index of the top element in the stack

    public Stack(int size) {
        maxSize = size; //set the max size
        stackArray = new int[maxSize]; // create the array of given size
        top = -1; // Stack is empty, so top = -1
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed ");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack unerflow");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }

    }

    public boolean isEmpty() {
        return (top == -1);

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements :");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ") ;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Stack myStack = new Stack(5);

        myStack.push(7);
        myStack.push(9);
        myStack.push(12);
        myStack.push(90);
        myStack.push(56);

        myStack.display();

        System.out.println("The top Element is :" + myStack.peek());
        System.out.println("Popped Element is : "  + myStack.pop());

        myStack.display();

    }
}