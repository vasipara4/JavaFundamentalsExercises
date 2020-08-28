package gr.codehub.collections;


class Stack {
    private char arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Stack(int size) {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack
    public boolean push(char x) {
        if (isFull()) {
            System.out.println("Stack OverFlow\n");
            return false;
        }

        arr[++top] = x;
        return true;
    }

    // Utility function to pop top element from the stack
    public char pop() {

        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return 0;
        }

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }

    // Utility function to return top element in a stack
    public char peek() {
        if (!isEmpty())
            return arr[top];

        return 0;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }
}