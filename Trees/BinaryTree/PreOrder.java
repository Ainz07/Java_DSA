package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        result.add(root.getData());
        result.addAll(preorderTraversal(root.getLeft()));
        result.addAll(preorderTraversal(root.getRight()));
        return result;
    }
}
