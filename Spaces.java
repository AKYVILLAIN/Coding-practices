
public class Spaces {
    public static void main(String[] args) {
        int[]x={1, 2, 3, 6, 3, 6, 1};
        int left=0;
        int right=x.length-1;
        sorter(x,left,right);
        
    }
    public static void sorter(int[]y,int left ,int high){
        int temp = 0;
        if(left<high){
            temp=realsorter(y, left, high);
        }
        
        sorter(y, left, temp-1);
        sorter(y, temp+1, high);
        
}
public static int realsorter(int[]y,int left,int high){
    int pivot=y[high];
    int i=left-1;
    for(int j=left;j<high;j++){
        if(y[j]<=pivot){
            i++;
        }
        int taken=y[i+1];
        y[i+1]=y[j];
        y[j]=taken;

    }
        return i;

}
}
    

