
import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(solve());
  }

  public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;
    
    ListNode p = head;
    ListNode c = head.next;
    ListNode m = head;
    while( c != null){
        ListNode s = c.next;
        c.next = p;
        p = c;
        c = s;
    }
    m.next = null;
    head = p;
    return head;
}
}

public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

}