import java.util.LinkedList;
import java.util.Queue;

public class FindSuccessor {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.val == key){
                    return q.poll();
                }
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FindSuccessor ans = new FindSuccessor();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);

        System.out.println(ans.findSuccessor(root, 6).val);
    }
}
