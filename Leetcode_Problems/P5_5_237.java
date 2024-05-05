public class P5_5_237 {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode abs = new ListNode(0);
        abs.val = 23;
        abs.next.val = 25;
        abs.next.next.val = 27;
        abs.next.next.next.val = 29;
        deleteNode(abs.next);
    }
}
