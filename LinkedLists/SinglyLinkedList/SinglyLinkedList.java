public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Inserting a node at a specific position
    public void insert(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            // Inserting a node at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            // Inserting a node at a specific position or end
            Node current = head;
            int index = 0;

            // Traversing the list to find the position just before the target position
            while (current != null && index < position - 1) {
                current = current.next;
                index++;
            }

            if (current == null) {
                // If position is greater than the number of nodes, insert at the end
                current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            } else {
                // Inserting a node in the middle or at the end
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Deleting a node from a specific position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            // Deleting a node from the beginning
            head = head.next;
        } else {
            Node current = head;
            int index = 0;

            // Traversing to the node just before the target position
            while (current != null && index < position - 1) {
                current = current.next;
                index++;
            }

            if (current == null || current.next == null) {
                // If position is greater than the number of nodes
                System.out.println("Position out of bounds");
                return;
            }

            // Delete the node at the target position
            current.next = current.next.next;
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
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements
        list.insert(10, 0);   // Insert at the beginning
        list.insert(20, 1);   // Insert at position 1
        list.insert(30, 2);   // Insert at position 2
        list.display();     

        list.insert(12, 1);   // Insert at position 1
        list.display();     

        list.insert(1, 0);    // Insert at the beginning
        list.display();     

        list.insert(50, 100); // Insert at a position greater than the length (effectively the end)
        list.display();      

        // Delete elements
        list.delete(0);      // Delete from the beginning
        list.display();    

        list.delete(2);      // Delete from position 2
        list.display();     

        list.delete(100);    // Attempt to delete from an out-of-bounds position
        list.display();    
    }
}
