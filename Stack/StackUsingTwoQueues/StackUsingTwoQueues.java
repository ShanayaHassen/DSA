import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingTwoQueues() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public int push(int value) {
        queue2.add(value);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.remove();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        System.out.println("Push "+stack.push(10));
        System.out.println("Push "+stack.push(20));
        System.out.println("Push "+stack.push(30));
        System.out.println("Push "+stack.push(40));
        System.out.println("Push "+stack.push(50));
        System.out.println("Pop "+stack.pop());
        System.out.println("Peek "+stack.peek());
    }
}
