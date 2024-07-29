public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Peek operation
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Display the queue
        queue.display(); //

        // Peek at the front element
        System.out.println("Peek: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeue: " + queue.dequeue()); 
        queue.display(); 

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); 

        // Dequeue remaining elements
        System.out.println("Dequeue: " + queue.dequeue()); 
        System.out.println("Dequeue: " + queue.dequeue()); 
        queue.display(); 

        // Check if queue is empty again
        System.out.println("Is queue empty? " + queue.isEmpty()); 
    }
}
