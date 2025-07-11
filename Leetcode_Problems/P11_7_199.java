import java.util.List;
import java.util.ArrayList;

public class P11_7_199 {

    // Define a basic TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        int level = 0;
        rightSideViewHelper(root, level, result);

        return result;
    }

    private void rightSideViewHelper(TreeNode node, int level, List<Integer> result) {
        if (node == null) {
            return;
        }

        if (level == result.size()) {
            result.add(node.val);
        }

        rightSideViewHelper(node.right, level + 1, result);
        rightSideViewHelper(node.left, level + 1, result);
    }

    public static void main(String[] args) {
        P11_7_199 obj = new P11_7_199();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        List<Integer> result = obj.rightSideView(root);
        System.out.println(result); // Output: [1, 3, 4]
    }
}
