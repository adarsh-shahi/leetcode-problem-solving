
import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(solve());
  }

  public ListNode middleNode(ListNode head) {
    if (head.next == null)
      return head;
    ListNode c = head;
    int count = 0;
    while (c != null) {
      c = c.next;
      count++;
    }
    int half = 1;
    c = head;
    while (half <= (count / 2)) {
      c = c.next;
      half++;
    }
    return c;
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