// Easy version of above solution
public class StackPractise {
    private int[] arr;
    private int top;
    private int capacity;

    // creating stack
    public StackPractise(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    // checking the stack is full
    public boolean isFull() {
        return (top == capacity - 1);
    }

    // checking the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // adding elements into the stack
    public void pushElement(int i) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = i;
    }

    // deleting elements into the stack
    public int popElement() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    // calculating the size of the stack
    public int sizeOfStack() {
        return top + 1;
    }

    // printing the stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackPractise stackPractise = new StackPractise(5);
        System.out.println("Size of the Stack: " + stackPractise.sizeOfStack());
        stackPractise.pushElement(12);
        stackPractise.pushElement(24);
        stackPractise.pushElement(36);
        System.out.print("Print the Stack: ");
        stackPractise.printStack();
        stackPractise.popElement();
        System.out.print("Print the Stack: ");
        stackPractise.printStack();
        System.out.println("Size of the Stack: " + stackPractise.sizeOfStack());
        stackPractise.popElement();
        stackPractise.popElement();
        System.out.println("Is Stack Empty: " + stackPractise.isEmpty());
        System.out.println("Is Stack Full: " + stackPractise.isFull());
    }

}
