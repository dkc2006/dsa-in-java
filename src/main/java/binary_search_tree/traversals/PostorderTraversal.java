package binary_search_tree.traversals;

public class PostorderTraversal {
    // Postorder traversal: Left -> Right -> Root
    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);   // Left subtree
            postorder(root.right);  // Right subtree
            System.out.print(root.data + " ");  // Visit root
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

        System.out.println("Postorder Traversal:");
        postorder(root);  // Expected Output: 2 7 5 12 20 15 10
    }
}
