import java.util.*;
public class Merege {
    public static void main(String[]args){
        List<List<Integer>>lisy=new ArrayList<>();
        lisy.add(Arrays.asList(1,3));
        lisy.add(Arrays.asList(2,4));
        lisy.add(Arrays.asList(6,8));
        lisy.add(Arrays.asList(9,10));
        System.out.println(lisy);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current =lisy.get(0);
        for(int i=1;i<lisy.size();i++){
            List<Integer>k=lisy.get(i);
            // List<Integer>current=lisy.get(i+1);
            if(current.get(1) >= k.get(0)){
                // int miner=Math.min(k.get(0),current.get(0));
                int major=Math.max(k.get(1),current.get(1));
                current.set(1,major);
                // result.add(Arrays.asList(miner,major));
                // result.add(new ArrayList<>(miner,major));
            }else{
                result.add(new ArrayList<>(current));
                current=k;
            }
            
        }
        result.add(current);
        System.out.println(result);

    }
    
}
