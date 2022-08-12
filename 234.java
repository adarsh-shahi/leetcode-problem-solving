public class solve{

  public static void main(String[] args) {
    
  }

public boolean isPalindrome(ListNode head) {
  if(head.next == null) return true;
  int count = 0;
  ListNode c = head;
  while(c != null){
      count++;
      c = c.next;
  }
  int copy = count;
  
  for(ListNode i = head; i != null; i = i.next){
      int first = i.val;
      int lastP = copy - 1;
      ListNode lastNode = head;
      while(lastP != 0){
          lastNode = lastNode.next;
          lastP--;   
      }
      copy--;
      if(first != lastNode.val) return false;
      if(count == (copy / 2)) break;
  }
  return true;
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