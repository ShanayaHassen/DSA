import java.util.ArrayDeque;

public class QueueUsingArrayDeque {
    private ArrayDeque<Integer> queue;

    // Constructor to initialize the queue
    public QueueUsingArrayDeque() {
        this.queue = new ArrayDeque<>();
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        queue.addLast(item);
        System.out.println("Enqueued " + item);
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        int item = queue.removeFirst();
        System.out.println("Dequeued " + item);
        return item;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        return queue.peekFirst();
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        QueueUsingArrayDeque queue = new QueueUsingArrayDeque();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        
        System.out.println("Front element is: " + queue.peek());
        
        queue.dequeue();
        queue.dequeue();
        
        queue.enqueue(6);
        queue.enqueue(7);
        
        System.out.println("Front element is: " + queue.peek());
    }
}
