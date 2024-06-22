import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingArrayDeque {
    private Deque<Integer> deque;

    public StackUsingArrayDeque() {
        this.deque = new ArrayDeque<>();
    }

    public int push(int value) {
        deque.addFirst(value);
        return value;
    }

    public int pop() {
        if (deque.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return deque.removeFirst();
    }

    public int peek() {
        if (deque.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return deque.peekFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingArrayDeque stack = new StackUsingArrayDeque();
        System.out.println("Push "+stack.push(10));
        System.out.println("Push "+stack.push(20));
        System.out.println("Push "+stack.push(30));
        System.out.println("Push "+stack.push(40));
        System.out.println("Push "+stack.push(50));
        System.out.println("Pop "+stack.pop());
        System.out.println("Peek "+stack.peek());
    }
}
