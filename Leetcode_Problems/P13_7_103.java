import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class P13_7_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        boolean rev = false; // flag to reverse the order

        Deque<TreeNode> q= new LinkedList<>();
        q.addFirst(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                if(rev){
                    TreeNode curr = q.removeLast();
                    level.add(curr.val);
                    if(curr.right != null) q.addFirst(curr.right);
                    if(curr.left != null) q.addFirst(curr.left);
                }else{
                    TreeNode curr = q.removeFirst();
                    level.add(curr.val);
                    if(curr.left != null) q.addLast(curr.left);
                    if(curr.right != null) q.addLast(curr.right);
                }
            }
            rev = !rev; // toggle the reverse flag
            result.add(level);
        }
        return result;
    }
}
