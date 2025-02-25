import java.util.*;
public class Matrix {
    public static void main(String[]args){
        List<List<Integer>>smiky=new ArrayList<>();
        smiky.add(Arrays.asList(1, 0, 0, 1));
        smiky.add(Arrays.asList(0, 0, 1, 0));
        smiky.add(Arrays.asList(0, 0, 0, 0));
        System.out.println(smiky);
        List<List<Integer>>raw=new ArrayList<>();

        // for rows
        for(int i=0;i<smiky.size();i++){
            List<Integer>op=smiky.get(i);
            // for(int x:op){
                if(op.contains(1)){
                    raw.add(Arrays.asList(1,1,1,1));
                // }
            }
            else{
                raw.add(Arrays.asList(0,0,0,0));
            }
        }

        // for(int i=0;i<smiky.size();i++){
        //         List<Integer>k=smiky.get(i);
        //     for(int j=0;j<smiky.size();j++){
        //         int count=0;
        //         if(k.contains(1))


        //     }
        // }
        System.out.println(raw);
    }
    
}
