
import java.util.*;

public class Choco {
    public static void main(String[]args){
        int[]arr={7, 3, 2, 4, 9, 12, 56};
        int m=5;
        int kk=menus(arr, m);
        System.out.println(kk);
    }
    public static int menus(int []x,int k){
        Arrays.sort(x);
        int n=x.length;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            int gh=x[i+k-1]-x[i];
            if(gh<diff){
                diff=gh;
            }

        }
        return diff;

    }
    
}
