public class StackUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackUsingArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public int push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return -1;
        }
        stackArray[++top] = value;
        return value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        System.out.println("Push "+stack.push(10));
        System.out.println("Push "+stack.push(20));
        System.out.println("Push "+stack.push(30));
        System.out.println("Push "+stack.push(40));
        System.out.println("Push "+stack.push(50));
        System.out.println("Pop "+stack.pop());
        System.out.println("Peek "+stack.peek());
    }
}
