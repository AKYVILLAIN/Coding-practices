import java.util.*;
public class Interval {
    public static void main(String[]args){
        List<List<Integer>>making=new ArrayList<>();
        making.add(Arrays.asList(1,3));
        making.add(Arrays.asList(4,5));

        List<Integer>ok=new ArrayList<>();
        ok.add(2);
        ok.add(6);

        System.out.println(making);
        // System.out.println(ok);
        List<List<Integer>>res=new ArrayList<>();
        boolean merge=false;

        for(List<Integer>x:making){
            if((x.get(1)>=ok.get(0)) &&(x.get(0)<=ok.get(1))){
                // for(int j=0;j<ok.size();j++){
                    int miner =Math.min(x.get(0),ok.get(0));
                    int major=Math.max(x.get(x.size()-1),ok.get(ok.size()-1));
                    ok.set(0,miner);
                    ok.set(1,major);
                    merge=true;
                    // System.out.println(major);

                
            }else{
                res.add(x);
            }
        }
        
        res.add(ok);
        res.sort(Comparator.comparingInt(a -> a.get(0)));
        System.out.println(res);

    }
   
}
