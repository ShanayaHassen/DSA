public class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Display the stack
        stack.display(); // 

        // Peek at the top element
        System.out.println("Peek: " + stack.peek()); 

        // Pop elements from the stack
        System.out.println("Pop: " + stack.pop()); 
        stack.display(); 

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); 
        // Pop remaining elements
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Pop: " + stack.pop()); 
        stack.display();

        // Check if stack is empty again
        System.out.println("Is stack empty? " + stack.isEmpty()); 
    }
}
