import java.util.Stack;

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

        return cur;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        a.val = 5;
        a.next.val = 2;
        a.next.next.val = 13;
        a.next.next.next.val = 3;
        a.next.next.next.next.val = 8;
        ListNode ans = removeNodes(a);
        while(ans.next !=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
