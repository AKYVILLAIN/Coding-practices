public class Addlast {
    Node head;
    private int listsize;
       Addlast() {
        this.listsize=0;

    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            // this listsize=0;
        }
    }
    public void addlast(int data){
        listsize++;

        
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = newnode;
        // current.next=

    }
    public void deleteb(){
        if(head==null){
            System.out.println("null");
            return;
        }
        listsize--;

        head=head.next;
        
    }
    public void deleteend(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        listsize--;

        Node current=head;
        Node exnext=head.next;
        while(exnext.next!=null){
            exnext=exnext.next;
            current=current.next;
        }
        current.next=null;
    }
    public int getsize(){
        return listsize;
    }
    public void printing(){
        if(head==null){
            return ;
        }
        Node res=head;
        while(res!=null){
            System.out.print(res.data+"->");
            res=res.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        Addlast list=new Addlast();
        list.addlast(1);
        list.addlast(12);
        list.addlast(13);
        list.printing();

        list.deleteb();
        list.printing();
        list.deleteend();
        list.printing();
        System.out.println(list.getsize());



    }
    
}
