import java.util.*;
public class Maximum_sub {
    public static void main(String[]args){
        int[]arr={2, 3, -8, 7, -1, 2, 3};
        Maxi(arr);
    }
    public static void Maxi(int []ar){
        List<Integer>ok=new ArrayList<>();
        int j =0;
        while(j!=ar.length){
        int max=0;
        for(int i=j+1;i<ar.length;i++){
            if((ar[j]+ar[i])>max){
                max+=ar[j];
            }

        }
        ok.add(max);
        j++;
        }
        System.out.println(ok);

    }
    
}
