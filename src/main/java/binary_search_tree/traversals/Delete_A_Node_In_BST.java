package binary_search_tree.traversals;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Delete_A_Node_In_BST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // Step 1: Find the node to be deleted
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found: now handle the 3 cases

            // Case 1 & 2: Node has one or zero children
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children, find inorder successor (smallest in right subtree)
            TreeNode successor = findMin(root.right);
            root.val = successor.val; // Replace value
            root.right = deleteNode(root.right, successor.val); // Delete the successor
        }

        return root;
    }

    // Helper function to find the minimum value node in a BST
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Utility function to print inorder traversal (for testing)
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Delete_A_Node_In_BST bst = new Delete_A_Node_In_BST();
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("Inorder before deletion:");
        bst.inorderTraversal(root);
        System.out.println();

        int key = 50;
        root = bst.deleteNode(root, key);

        System.out.println("Inorder after deleting " + key + ":");
        bst.inorderTraversal(root);
    }
}