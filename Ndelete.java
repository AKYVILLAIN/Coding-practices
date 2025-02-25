
public class Ndelete {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static ListNode x(ListNode head,int n){
        if(head==null){
            return null;
        }
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        // int x=n
        
        ListNode first=dummy;
        ListNode second=dummy;
        for(int i=0;i<=n;i++){
            first=first.next;
        }
        
        while(first!=null){
            
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;

    }
    public static void printed(ListNode head){
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    public static void main(String[]args){
        // Ndelete n=new Ndelete();
        int n=2;
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode res=x(head, n);
        printed(res);
    
}
}
