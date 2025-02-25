import java.util.*;
public class Product {
    public static void main(String[] args) {
        int[]x={10, 3, 5, 6, 2};
        Pre(x);
        
    }
    public static void Pre(int[]y){
        List<Integer>ok=new ArrayList<>();
        int n=y.length;
        int j=0;
        // int i=0;
        while(j!=n){
        int taken=1;

            for(int i=0;i<n;i++){
                if(y[j]==y[i])continue;
                taken*=y[i];
            }
             ok.add(taken);
            j++;
        }
        // }
        System.out.println(ok);
    }
}
    

