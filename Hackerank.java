import java.util.ArrayList;
import java.util.List;

public class Hackerank {
    public static void main(String[] args) {
        // int[]m={ 1000000002, 1000000003, 1000000004, 1000000005};
        List<Long>ok=new ArrayList<>();
        ok.add(1000000001L);
        ok.add(1000000002L);
        ok.add(1000000003L);
        ok.add(1000000004L);
        ok.add(1000000005L);
        long b=popx(ok);
        System.out.println(b);
    }
    public static long popx(List<Long>ar){
        long x = 0;
    // int n=ar.size();
        for(Long value:ar){
            x+=value;
        }
        return x;
    }
    }

    
