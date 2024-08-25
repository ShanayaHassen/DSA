public class QueueForBFS {
    private int[] elements;
    private int front, rear, size, capacity;

    public QueueForBFS(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull())
            return;
        rear = (rear + 1) % capacity;
        elements[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int item = elements[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
}
