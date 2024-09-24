
public class P15_7_2196 {
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

    public static TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode parent = new TreeNode(descriptions[0][0]);
        TreeNode child= new TreeNode(descriptions[0][1]);
        if(descriptions[0][2]==1){
            parent.left = child;
        }
        else
            parent.right = child;
        for (int i=1; i<descriptions.length; i++){
            TreeNode new_parent = new TreeNode(descriptions[i][0]);
            TreeNode new_child= new TreeNode(descriptions[i][1]);
            if(descriptions[i][2]==1){
                new_parent.left = child;
            }
            else
                new_parent.right = child;
        }
        return parent;

    }

    public static void main(String[] args) {
        int[][] descriptions = { { 20, 15, 1 }, { 20, 17, 0 }, { 50, 20, 1 }, { 50, 80, 0 }, { 80, 19, 1 } };
        System.out.println(createBinaryTree(descriptions));
    }
}
