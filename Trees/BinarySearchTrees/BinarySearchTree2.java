public class BinarySearchTree2 {

    // Method to create a new node
    public static TreeNode createNewNode(int data) {
        return new TreeNode(data);
    }

    // Method to insert a new node into the BST
    public static TreeNode insertNode(TreeNode root, int data) {
        if (root == null) {
            return createNewNode(data); // Create a new node if root is null
        }

        // If data to insert is less than current node, insert in left subtree
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } 
        // If data to insert is greater than current node, insert in right subtree
        else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root; // Return the unchanged node pointer
    }

    // Method to print the tree (Inorder Traversal)
    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        // Create the original tree
        TreeNode root = createNewNode(8);
        TreeNode node3 = createNewNode(3);
        TreeNode node10 = createNewNode(10);
        TreeNode node1 = createNewNode(1);
        TreeNode node6 = createNewNode(6);
        TreeNode node4 = createNewNode(4);
        TreeNode node7 = createNewNode(7);
        TreeNode node14 = createNewNode(14);
        TreeNode node13 = createNewNode(13);

        // Construct the binary search tree
        root.left = node3;
        root.right = node10;

        node3.left = node1;
        node3.right = node6;

        node6.left = node4;
        node6.right = node7;

        node10.right = node14;
        node14.left = node13;

        System.out.println("Original BST (Inorder Traversal):");
        printInOrder(root); // Print the original tree
        System.out.println();

        // Insert new nodes
        root = insertNode(root, 20);
        root = insertNode(root, 2);

        System.out.println("BST after inserting 20 and 2 (Inorder Traversal):");
        printInOrder(root); // Print the tree after insertion
    }
}
