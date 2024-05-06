import java.utill.ListNode;

public class Pp6_5_2487 {
    public static ListNode removeNodes(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        while (cur != null) {
            while (!stack.isEmpty() && stack.peek().val < cur.val) {
                stack.pop();
            }
            stack.push(cur);
            cur = cur.next;
        }

        ListNode nxt = null;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            cur.next = nxt;
            nxt = cur;
        }

        return nxt; // return nxt instead of cur
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        a.next.next = new ListNode(2);
        a.next.next.next = new ListNode(13);
        a.next.next.next.next = new ListNode(3);
        a.next.next.next.next.next = new ListNode(8);

        ListNode ans = removeNodes(a);
        while (ans != null) { // Change the condition to ans != null
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
