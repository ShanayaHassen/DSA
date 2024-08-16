public class BinaryTree {

    // Method to create a new node
    public static TreeNode createNewNode(int data) {
        return new TreeNode(data);
    }

    // Method to search for a node with the given data
    public static boolean findNode(TreeNode root, int value) {
        if (root == null) {
            return false; // Base case: if the root is null, the node is not found
        }

        if (root.data == value) {
            return true; // Node found
        } else if (value < root.data) {
            return findNode(root.left, value); // Search in the left subtree
        } else {
            return findNode(root.right, value); // Search in the right subtree
        }
    }

    public static void main(String[] args) {
        // Create nodes
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

        // Print values to verify structure
        System.out.println("root.right.data: " + root.right.data); // Expected: 10
        System.out.println("root.left.right.data: " + root.left.right.data); // Expected: 6
        System.out.println("root.right.right.data: " + root.right.right.data); // Expected: 14
        System.out.println("root.left.left.data: " + root.left.left.data); // Expected: 1

        // Search for specific nodes
        int searchValue = 7;
        if (findNode(root, searchValue)) {
            System.out.println("Node " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node " + searchValue + " not found in the BST.");
        }

        searchValue = 12;
        if (findNode(root, searchValue)) {
            System.out.println("Node " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node " + searchValue + " not found in the BST.");
        }
    }
}
