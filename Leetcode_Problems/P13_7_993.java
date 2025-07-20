import javax.swing.tree.TreeNode;

public class P13_7_993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xf= isCousin(root.left, x, 0, -1, -1);
        TreeNode yf= isCousin(root.right, y, 0);
        if(xf == null || yf == null) return false; // if either node is not found
        return xf == yf;
    }

    private TreeNode isCousin(TreeNode node, int val, int level, int left, int right) {
        if(node == null) return null;
        level++;
        if(node.right != null || node.left != null) {
            if(node.right.val == val || node.left.val == val) {
                return level+1; // found the cousin at this level
            }
            

        return -1;
    }
}
