import java.util.ArrayList;
import java.util.List;

public class Connection {
   static  class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;

        }
        ListNode x=l1;
        // ListNode y=l2;
        while(x.next!=null){
            x=x.next;
        }
        x.next=l2;
        return l1;
    }
    public static ListNode swap(ListNode l1){
        if(l1==null){
            return null;
        }
        List<Integer>ok=new ArrayList<>();
        ListNode temp=l1;
        while(temp!=null){
            ok.add(temp.data);
            temp=temp.next;
        }
        int n=ok.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ok.get(i)>ok.get(j)){
                    int tank=ok.get(i);
                    ok.set(i, ok.get(j));
                    ok.set(j,tank);
                }

            }
        }
        temp=l1;
        int i=0;

        while(temp!=null){
            temp.data=ok.get(i);
            i++;
            temp=temp.next;
        }
        return l1;
    }
    public static void printed(ListNode l1){
        while(l1!=null){
            System.out.print(l1.data+"->");
            l1=l1.next;
        }
    }
    public static void main(String[]args){
        // Connection c=new Connection();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode head2=new ListNode(9);
        head2.next=new ListNode(2);
        head2.next.next=new ListNode(3);
        head2.next.next.next=new ListNode(4);
        head2.next.next.next.next=new ListNode(5);
        ListNode res=merge(head,head2);
        ListNode res2=swap(res);
        // printed(res);
        // System.out.println("new : ");
        printed(res2);
        

    }
    
}
