public ListNode reverseBetween(ListNode head, int left, int right) {
  if(head.next == null) return head;
  ListNode c = head;
  int copy = left;
  ListNode headFirst = null;
  while((left - 1) > 0){
      headFirst = c;
      c = c.next;
      left--;
  }
  ListNode p = c;
  ListNode l = c.next;
  while((right) > copy){
      ListNode s = null;
      if(l != null){
          s = l.next;
          l.next = p;
      }
      
      p = l;
      l = s;
      right--;
  }
  c.next = l;
  if(headFirst == null){
      head = p;
  }   
  else {
      headFirst.next = p;
  }
  
  return head;
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