public class BinarySearchTree3 {
    TreeNode root;

    // Method to find the inorder successor
    TreeNode inorderSuccessor(TreeNode node) {
        TreeNode current = node.right;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Method to delete a node
    TreeNode deleteNode(TreeNode root, int key) {
        // Base case: If the tree is empty
        if (root == null) {
            return root;
        }

        // Recursive case: Traverse the tree
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found

            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            // Get the inorder successor (smallest in the right subtree)
            TreeNode successor = inorderSuccessor(root);

            // Copy the inorder successor's content to this node
            root.data = successor.data;

            // Delete the inorder successor
            root.right = deleteNode(root.right, successor.data);
        }
        return root;
    }

    // Method for inorder traversal of the tree
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Method to insert a new node with given key
    TreeNode insert(TreeNode node, int key) {
        if (node == null) {
            return new TreeNode(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree3 tree = new BinarySearchTree3();

        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 14);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 13);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(tree.root);

        tree.root = tree.deleteNode(tree.root, 6);

        System.out.println("\nInorder traversal after deletion:");
        tree.inorder(tree.root);
    }
}
