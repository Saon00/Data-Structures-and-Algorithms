package com.stacks;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);
        stack.push(new Student("Saon", "Sikder", 2502));
        stack.push(new Student("Sakib", "Al Hasan", 2505));
        stack.push(new Student("Md", "Muaz", 2517));
        stack.push(new Student("Momenatul", "Islam", 2522));
        stack.push(new Student("Anamul", "Haq", 2523));

        stack.printStack();
        System.out.println("Size of this Stack: " + stack.size());
        System.out.println("Popped item: " + stack.pop());
        stack.printStack();
        System.out.println("Size of this Stack: " + stack.size());
        System.out.println("Peeked item: " + stack.peek());
        stack.printStack();
        System.out.println("Size of this Stack: " + stack.size());


    }
}
