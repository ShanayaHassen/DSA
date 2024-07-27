public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            insertAtEnd(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete a node from the end
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete a node from a specific position
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            deleteFromBeginning();
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
        } else {
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current == head) {
                head = current.next;
            }
            if (current == tail) {
                tail = current.prev;
            }
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert elements
        list.insertAtBeginning(10);   // Insert at the beginning
        list.insertAtEnd(20);         // Insert at the end
        list.insertAtPosition(15, 1); // Insert at position 1
        list.display();       
                
        list.insertAtBeginning(5);    // Insert at the beginning
        list.display();               

        list.insertAtEnd(25);         // Insert at the end
        list.display();               

        list.insertAtPosition(30, 100); // Insert at a position greater than the length (effectively the end)
        list.display();               

        // Delete elements
        list.deleteFromBeginning();   // Delete from the beginning
        list.display();              

        list.deleteFromEnd();         // Delete from the end
        list.display();               

        list.deleteFromPosition(1);   // Delete from position 1
        list.display();               

        list.deleteFromPosition(100); // Attempt to delete from an out-of-bounds position
        list.display();             
    }
}
