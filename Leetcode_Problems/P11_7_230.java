import java.util.List;
import java.util.ArrayList;

public class P11_7_230 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        if (root == null || k <= 0) {
            return -1; 
        }
        helper(root, result, k);
        if (k <= result.size()) {
            return result.get(k - 1);
        }
        return -1;
    }

    private void helper(TreeNode node, List<Integer> result, int k){
        if(node == null || result.size() >= k) {
            return;
        }
        helper(node.left, result, k);
        if (result.size() < k) {
            result.add(node.val);
        }
        helper(node.right, result, k);
    }

    public static void main(String[] args) {
        P11_7_230 obj = new P11_7_230();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        
        int k = 3; // Example value for k
        int result = obj.kthSmallest(root, k);
        System.out.println(result); // Expected output: 3
    }
}
