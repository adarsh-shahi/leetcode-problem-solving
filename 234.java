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
        int copy = count; //   COPY THIS LIST TO ARRAY :))))))))
        int s = 1;  
        for(ListNode i = head; i != null; i = i.next, s++){
            int first = i.val;
            int lastP = s;
            ListNode lastNode = i;
            while(lastP != copy){
                lastNode = lastNode.next;
                lastP++;   
            }
            copy--;
            if(first != lastNode.val) return false;
            if(count / 2 == copy) break;
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