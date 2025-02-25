import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Linkeddms {
    ListNode head;
    class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }}
        public ListNode merry(ListNode list1,ListNode list2){
            if(list1==null)return list2;
            if(list2==null)return list1;
            // ListNode list1=list1;
            // ListNode list2=list2;
            ListNode dummy=new ListNode(-1);
            ListNode current=dummy;
            while(list1!=null && list2!=null){
                if(list1.data<=list2.data){
                    current.next=list1;
                    list1=list1.next;
                }
                else{
                    current.next=list2;
                    list2=list2.next;
                }
                current =current.next;
            
        }
        if (list1!=null)current.next=list1;
        if (list2!=null)current.next=list2;
        return dummy.next;
    }
    public static ListNode sort(ListNode head) {
        if(head==null){
            return null;
        }
        List<Integer>op=new ArrayList<>();
        ListNode res=head;
        while(res!=null){
            op.add(res.data);
            res=res.next;
        }
        Collections.sort(op);
        res=head;
        
        for(int cdd:op){
            res.data=cdd;
            res=res.next;
        }
        return head;
    }
    public void printlist(ListNode head){
        if(head==null){
        System.out.println("List is empty");
        return;
    }

    ListNode curr2 = head;
        while(curr2!=null){
            System.out.print(curr2.data);
            if(curr2.next!=null){
                System.out.print("->");
            }
            curr2=curr2.next;
        }
    }


    public static void main(String[]args){
        Linkeddms l1=new Linkeddms();
        ListNode head=l1.new ListNode(1);
        head.next=l1.new ListNode(2);
        head.next.next=l1.new ListNode(4);
        Linkeddms l2=new Linkeddms();
        ListNode head2=l2.new ListNode(1);
        head2.next=l2.new ListNode(3);
        head2.next.next=l2.new ListNode(4);

        ListNode mergedHead = l1.merry(head, head2);
        System.out.println("Merged Linked List:");
        l1.printlist(mergedHead);

        // Sort the merged linked list
        ListNode sortedHead = sort(mergedHead);
        System.out.println("Sorted Linked List:");
        l1.printlist(sortedHead);
        

    }
    
}
