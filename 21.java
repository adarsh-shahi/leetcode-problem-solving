import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve());
    }

    private static ListNode solve(ListNode list1, ListNode list2){
      if(list1 == null && list2 == null) return list1;
      else if(list1 == null)
          return list2;
      else if(list2 == null)return list1;
      ListNode p1 = list1;
      ListNode p2 = list2;
      ListNode head; 
      if(list1.val < list2.val) {
       head = list1;
       p1 = list1.next;
      }
      else {
       head = list2;   
       p2 = list2.next;   
      } 
      ListNode p = head;
      while(p1 != null && p2 != null){
          if(p1.val > p2.val){
              p.next = p2;
              p = p.next;
              p2 = p2.next;
          }
          else{
              p.next = p1;
               p = p.next;
              p1 = p1.next;
          }
      }
      while(p1 != null){
          p.next = p1;
          p = p.next;
          p1 = p1.next;
      }
      while(p2 != null){
          p.next = p2;
          p = p.next;
          p2 = p2.next;
      }
      return head;
    }
    
}