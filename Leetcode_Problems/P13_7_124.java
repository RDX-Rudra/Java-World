public class P13_7_124 {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};
        maxPathFinder(root, max);
        return max[0];
    }

    private int maxPathFinder(TreeNode node, int[] max){
        if(node == null) return 0;
        int left = maxPathFinder(node.left, max);
        int right = maxPathFinder(node.right, max);
        max[0] = Math.max(max[0], node.val + left + right);
        return Math.max(node.val, node.val + Math.max(left, right));
    }
}
