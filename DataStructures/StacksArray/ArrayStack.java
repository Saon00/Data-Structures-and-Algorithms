package com.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Student[] stack;
    private int top;

    ArrayStack(int capacity) {
        stack = new Student[capacity];
    }

    public void push(Student student) { // time complexity -> O(n)
        if (top == stack.length) {
            // need to resize the backing array
            Student[] newArray = new Student[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = student;
    }

    public Student pop() { // time complexity -> O(1)
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Student student = stack[--top];
        stack[top] = null;
        return student;
    }

    public int size() {
        return top;
    }

    public Student peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


}
