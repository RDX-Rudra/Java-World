import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(root, sum, 0, list, new ArrayList<>());
        return list;
    }

    private static void helper(Node root, int target, int sum, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> curr) {
        if (root == null)
            return;

        curr.add(root.data);
        sum += root.data;

        if (root.left == null && root.right == null && sum == target) {
            list.add(new ArrayList<>(curr));
        }

        helper(root.left, target, sum, list, curr);
        helper(root.right, target, sum, list, curr);

        curr.remove(curr.size() - 1);
    }
}

public class p1_22 {
    public static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String[] ip = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < ip.length) {
            Node currNode = queue.poll();

            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }

            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = Integer.parseInt(scn.nextLine());

        while (t-- > 0) {
            int s = Integer.parseInt(scn.nextLine());
            String res = scn.nextLine();
            Node root = buildTree(res);

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.printPaths(root, s);

            Collections.sort(ans, new ElementWiseComparator());

            for (int i = 0; i < ans.size(); i++) {
                for (int j = 0; j < ans.get(i).size(); j++) {
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    static class ElementWiseComparator implements Comparator<ArrayList<Integer>> {
        @Override
        public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            int minLength = Math.min(list1.size(), list2.size());

            for (int i = 0; i < minLength; i++) {
                int comparison = Integer.compare(list1.get(i), list2.get(i));
                if (comparison != 0) {
                    return comparison;
                }
            }

            return Integer.compare(list1.size(), list2.size());
        }
    }
}
