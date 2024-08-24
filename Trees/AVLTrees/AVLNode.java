// Node class for AVL Tree
public class AVLNode {
    int key;
    int height;
    AVLNode left, right;

    // Constructor to create a new node
    AVLNode(int key) {
        this.key = key;
        this.height = 1; // Initial height of a new node is 1
        this.left = null;
        this.right = null;
    }
}
