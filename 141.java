import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(solve());
  }

  public boolean hasCycle(ListNode head) {
    if (head == null)
      return false;

    ListNode c = head;
    int min = Integer.MIN_VALUE;
    while (c != null) {
      if (c.val == min)
        return true;
      c.val = min;
      c = c.next;
    }
    return false;
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