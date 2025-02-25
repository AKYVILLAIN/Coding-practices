public class Linkswap {
    ListNode head;
   static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode swapp(ListNode head,int x){
        if (head == null || head.next == null) {
            return head; // If list is empty or has only one node, no swap needed.
        }
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            int temp=cur.val;
            cur.val=pre.val;
            pre.val=temp;
            // cur=pre.next;
            pre=cur.next;
            if(pre!=null){
                cur=pre.next;

            }else{
                break;
            }
        }
        return head;

       
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next =new ListNode(4);
        int k=3;
        ListNode x=swapp(head,k);
        printList(x);

    }
    
}
