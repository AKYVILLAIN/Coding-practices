import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayLinked {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static List<Integer>x (int[][]arr){
        List<Integer>x=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                x.add(arr[i][j]);
            }
        }
        Collections.sort(x);
        return x;

    }
    public static ListNode creeet(List<Integer>mkt){
        if (mkt.isEmpty()) return null;
        ListNode head=new ListNode(mkt.get(0));
        ListNode temp=head;
        for(int i=1;i<mkt.size();i++){
            temp.next=new ListNode(mkt.get(i));
            temp=temp.next;
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
        int [][]arr={{1,4,5},{1,3,4},{2,6}};
        // ListNode cv=creeet(arr);
        ArrayLinked al=new ArrayLinked();
        // al.printlist(cv);
        List<Integer>b=x(arr);
        ListNode cv=creeet(b);
        al.printlist(cv);
        // System.out.println(b);
    }
}
