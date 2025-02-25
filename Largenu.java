
import java.math.BigInteger;

public class Largenu {
    public static void main(String[]args){
        int a=100;
        BigInteger b =new BigInteger("1");
        for(int i=1;i<=100;i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b);
    }
    
}
