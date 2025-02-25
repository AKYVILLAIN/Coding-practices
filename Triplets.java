import java.util.*;
public class Triplets {
    public static void main(String[]args){
        List<List<Integer>>ok=new ArrayList<>();
        int []arr={1, -2, 1, 0, 5};
        int n =arr.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ok.add(Arrays.asList(i,j,k));
                    }
                }
            }
        }
        System.out.println(ok);
    }
    
}
