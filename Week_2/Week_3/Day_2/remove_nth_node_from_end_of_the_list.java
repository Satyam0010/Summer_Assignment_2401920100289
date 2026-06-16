package Week_2.Week_3.Day_2;
  class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class remove_nth_node_from_end_of_the_list {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null) return null;

        ListNode a = head,b= head;

        for(int i = 1;i<n;i++){
            b = b.next;
        }

        ListNode prev = null;

        while(b.next != null){
            b = b.next;

            prev = a;
            a = a.next;
        }

        if(prev == null) return head.next;
        prev.next = a.next;
        return head;
    }
}
