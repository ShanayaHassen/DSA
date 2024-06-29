public class QueueUsingArray {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue with a specific capacity
    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear++;
        queue[rear] = item;
        size++;
        System.out.println("Enqueued " + item);
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        int item = queue[front];
        // Shift all elements one position to the left
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        size--;
        System.out.println("Dequeued " + item);
        return item;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        return queue[front];
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        
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
