public class BinaryTree {
    public static TreeNode createNewNode(char data) {
        return new TreeNode(data);
    }

    public static void main(String[] args) {
        TreeNode root = createNewNode('R');
        TreeNode nodeA = createNewNode('A');
        TreeNode nodeB = createNewNode('B');
        TreeNode nodeC = createNewNode('C');
        TreeNode nodeD = createNewNode('D');
        TreeNode nodeE = createNewNode('E');
        TreeNode nodeF = createNewNode('F');
        TreeNode nodeG = createNewNode('G');

        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        System.out.println("root.right.left.data: " + root.right.left.data);
        System.out.println("root.left.right.data: " + root.left.right.data);
        System.out.println("root.right.right.data: " + root.right.right.data);
        System.out.println("root.left.left.data: " + root.left.left.data);
    }
}
