import javax.swing.tree.TreeNode;

public class P12_7_1448 {

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
    
    public int goodNodes(TreeNode root) {
        int maxnum = root.val;
        return countGdNodes(root, maxnum);
    }

    private int countGdNodes(TreeNode node, int maxnum){
        if(node == null) {
            return 0;
        }
        maxnum = Math.max(maxnum, node.val);
        if(node.val>= maxnum){
            return 1 + countGdNodes(node.left, maxnum) + countGdNodes(node.right, maxnum);
        } else {
            return countGdNodes(node.left, maxnum) + countGdNodes(node.right, maxnum);  
        }
    }

    public static void main(String[] args) {
        P12_7_1448 solution = new P12_7_1448();
        TreeNode root = solution.new TreeNode(3);
        root.left = solution.new TreeNode(1);
        root.right = solution.new TreeNode(4);
        root.left.left = solution.new TreeNode(3);
        root.right.left = solution.new TreeNode(1);
        root.right.right = solution.new TreeNode(5);
        int result = solution.goodNodes(root);
        System.out.println("Number of good nodes: " + result);
    }

}
