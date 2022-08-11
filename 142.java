import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(solve());
  }

  public ListNode hasCycle(ListNode head) {
    if (head == null)
      return null;

    ListNode c = head;
    int min = Integer.MIN_VALUE;
    while (c != null) {
      if (c.val == min)
        return c;
      c.val = min;
      c = c.next;
    }
    return null;
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