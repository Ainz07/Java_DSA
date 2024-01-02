package BinaryTree;

public class CreateTree {
    public TreeNode root;

    public void createBinaryTree() {
        TreeNode a = new TreeNode(15, null, null);
        TreeNode b = new TreeNode(7, null, null);
        TreeNode c = new TreeNode(20, a, b);
        TreeNode d = new TreeNode(9, null, null);

        root = new TreeNode(3, d, c);
    }
}
