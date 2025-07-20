import java.util.LinkedList;
import java.util.Queue;

public class P13_7_993 {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false, foundY = false;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null && curr.right != null) {
                    if ((curr.left.val == x && curr.right.val == y) ||
                        (curr.left.val == y && curr.right.val == x)) {
                        return false; // siblings, not cousins
                    }
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                    if (curr.left.val == x) foundX = true;
                    if (curr.left.val == y) foundY = true;
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                    if (curr.right.val == x) foundX = true;
                    if (curr.right.val == y) foundY = true;
                }
            }

            if (foundX && foundY) return true; // found both at the same level
            if (foundX || foundY) return false; // only one found at this level
        }

        return false;
    }
}
