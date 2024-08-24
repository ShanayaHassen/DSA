// AVL Tree class
public class AVLTree {
    private AVLNode root;

    AVLTree() {
        this.root = null;
    }
    public AVLNode getRoot() {
        return root;
    }
    public void setRoot(AVLNode root) {
        this.root = root;
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        
        // Create nodes
        AVLNode root = new AVLNode(30);
        AVLNode node1 = new AVLNode(20);
        AVLNode node2 = new AVLNode(40);
        AVLNode node3 = new AVLNode(10);
        AVLNode node4 = new AVLNode(25);
        AVLNode node5 = new AVLNode(35);
        AVLNode node6 = new AVLNode(50);
        
        // Set up tree structure
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        
        // Set root of the tree
        tree.setRoot(root);
        
        // Print tree structure
        System.out.println("Root: " + tree.getRoot().key);
        System.out.println("Left Child of Root: " + tree.getRoot().left.key);
        System.out.println("Right Child of Root: " + tree.getRoot().right.key);
        System.out.println("Left Child of Left Child of Root: " + tree.getRoot().left.left.key);
        System.out.println("Right Child of Left Child of Root: " + tree.getRoot().left.right.key);
        System.out.println("Left Child of Right Child of Root: " + tree.getRoot().right.left.key);
        System.out.println("Right Child of Right Child of Root: " + tree.getRoot().right.right.key);
    }
}
