public class Finni {
    public static void main(String[] args) {
        int[]rr={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key=3;
        int n=rr.length;
        int count=0;
        while(count<n){
            if(rr[count]==key){
                System.out.println("Element is present at index " + count);
                return;
            }
            count++;
        }
    }
}
    

