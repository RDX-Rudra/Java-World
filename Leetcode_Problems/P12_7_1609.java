import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class P12_7_1609 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean evenLevel = true;

        while (!q.isEmpty()) {
            int size = q.size();
            int prevVal = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int val = node.val;

                // Parity check
                if (evenLevel) {
                    // Value must be odd and strictly increasing
                    if (val % 2 == 0 || val <= prevVal) return false;
                } else {
                    // Value must be even and strictly decreasing
                    if (val % 2 != 0 || val >= prevVal) return false;
                }

                prevVal = val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            evenLevel = !evenLevel;
        }

        return true;
    }

    public static void main(String[] args) {
        P12_7_1609 solution = new P12_7_1609();
        TreeNode root = solution.new TreeNode(2);
        root.left = solution.new TreeNode(3);
        root.right = solution.new TreeNode(5);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(6);
        root.right.left = solution.new TreeNode(7);
        root.right.right = solution.new TreeNode(8);
        boolean result = solution.isEvenOddTree(root);
        System.out.println("Is the tree an even-odd tree? " + result);
    }
}
