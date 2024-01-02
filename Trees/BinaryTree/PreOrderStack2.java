package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderStack2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.empty() || current != null) {
            if (current != null) {
                result.add(current.getData());
                if (current.getRight() != null) {
                    stack.push(current.getRight());
                }
                current = current.getLeft();
            } else {
                current = stack.pop();
            }
        }
        return result;
    }
}
