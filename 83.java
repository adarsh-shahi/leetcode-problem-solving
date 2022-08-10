import java.util.*;
class solve {
    public static void main(String[] args) {
     ListNode listNode = new ListNode();

    }

    class Solution {
      public ListNode deleteDuplicates(ListNode head) {
          if(head == null || head.next == null) return head;
   
          ListNode c = head.next;
          ListNode p = head;
          int previous = head.val;
          
          while( c != null ){
              if(c.val != previous){
                  
                  previous = c.val;
                  p = c;
              }
              else {
                  p.next = c.next;
              }
              c = c.next;
          }
          return head;
      }
  }
    
}

public class ListNode {
      int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }



}
  

