package BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateTree bt = new CreateTree();
        bt.createBinaryTree(); // We Create a Binary Tree

        PreOrder solution = new PreOrder(); // We Do the Recursive PreOrder Traversal
        List<Integer> finalResult = solution.preorderTraversal(bt.root);
        System.out.println("PreOrder Traversal: " + finalResult);

        PreOrderStack solution2 = new PreOrderStack(); // We Do the Iterative PreOrder Traversal
        List<Integer> finalResult2 = solution2.preorderTraversal(bt.root);
        System.out.println("PreOrder Traversal using Stack: " + finalResult2);

        PreOrderStack2 solution3 = new PreOrderStack2(); // We Do the Iterative PreOrder Traversal(alternative method)
        List<Integer> finalResult3 = solution3.preorderTraversal(bt.root);
        System.out.println("PreOrder Traversal using Stack(alternative method): " + finalResult3);

        PostOrder solution4 = new PostOrder(); // We Do the Recursive PostOrder Traversal
        List<Integer> finalResult4 = solution4.postorderTraversal(bt.root);
        System.out.println("PostOrder Traversal: " + finalResult4);


    }
}
