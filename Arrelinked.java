public class Arrelinked {
    ListNode head;

    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to convert a 2D array into an array of linked lists
    public static ListNode[] conversion(int[][] arr) {
        ListNode[] list = new ListNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ListNode head = null;
            ListNode current = null;
            for (int j = 0; j < arr[i].length; j++) {
                ListNode newnode = new ListNode(arr[i][j]);
                if (head == null) {
                    head = newnode;
                    current = head;
                } else {
                    current.next = newnode;
                    current = current.next;
                }
            }
            list[i] = head;
        }
        return list;
    }
    public static ListNode merrging(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(l1!=null &&l2!=null){
            if(l1.val<=l2.val){
                current.next=l1;
                l1=l1.next;
            }else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return dummy.next;
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode firstone=null;
        for(ListNode x:lists){
            firstone=merrging(firstone, x);
        }
        return firstone;
    }

    // Static method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Arrelinked al=new Arrelinked();
        int[][] arr = { {1, 4, 5}, {1, 3, 4}, {2, 6} };
        ListNode[] x = Arrelinked.conversion(arr); // Call the static method directly
        // for (ListNode head : x) {
        //     printList(head); // Use the static method to print
        // }
        ListNode result = mergeKLists(x);
        al.printList(result);
    }
}
