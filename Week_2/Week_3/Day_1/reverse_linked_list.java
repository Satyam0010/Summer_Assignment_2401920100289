package Week_2.Week_3.Day_1;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class reverse_linked_list {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode pre = head;
        ListNode post = pre.next;

        while(pre != null){
            pre.next = prev;
            prev = pre;
            pre = post;
            if(post != null){
                post = post.next;
            } 
        }
        return prev;
    }
}
