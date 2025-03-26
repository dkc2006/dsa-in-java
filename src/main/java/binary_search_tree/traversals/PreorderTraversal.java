package binary_search_tree.traversals;

public class PreorderTraversal {
    // Preorder traversal: Root -> Left -> Right
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");  // Visit root
            preorder(root.left);                // Left subtree
            preorder(root.right);               // Right subtree
        }
    }

    public static void main(String[] args) {
        // Creating a sample BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("Preorder Traversal:");
        preorder(root);  // Expected Output: 10 5 2 7 15 12 20
    }
}
