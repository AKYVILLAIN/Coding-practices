public class Linkedms{
    ListNode head;
    class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertion(int data){
        ListNode newNode=new ListNode(data);
        ListNode curr=head;
        if(head==null){
            head=newNode;
        }else{
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }

    }
    public void printlist(){
        ListNode curr2 = head;
        if(head==null){
        System.out.println("List is empty");
        return;
    }else{
        while(curr2!=null){
            System.out.print(curr2.data);
            if(curr2.next!=null){
                System.out.print("->");
            }
            curr2=curr2.next;
        }
    }
}
    public static void main(String[]args){
        Linkedms l1=new Linkedms();
        l1.insertion(1);
        l1.insertion(2);
        l1.insertion(3);
        l1.printlist();
        // ListNode head=l1.new ListNode(1);
        // head.next=l1.new ListNode(2);
        // head.next.next=l1.new ListNode(4);

    }
}