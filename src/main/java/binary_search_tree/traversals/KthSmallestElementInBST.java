package binary_search_tree.traversals;


public class KthSmallestElementInBST {
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return result;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node == null) return;

        inorderTraversal(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorderTraversal(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        KthSmallestElementInBST finder = new KthSmallestElementInBST();
        int k = 3;
        System.out.println("The " + k + "rd smallest element is " + finder.kthSmallest(root, k));
    }
}
