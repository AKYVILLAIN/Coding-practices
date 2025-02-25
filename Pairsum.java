
public class Pairsum {
    public static void main(String[]args){
        int []x={0, -1, 2, -3, 1};
        int target=-2;
        sexy(x, target);
    }
    public static void sexy(int[]y,int tar){
        int n =y.length;
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(y[i]+y[j]==tar){
                    System.out.println(y[i]+" "+y[j]);
                }
                else{
                    System.out.println("No pair found");
                }
            }
        }
    }
    
}
