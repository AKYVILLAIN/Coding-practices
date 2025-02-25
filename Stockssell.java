

public class Stockssell {
    public static void main(String[] args) {
        int[]buys={1, 3, 6, 9, 11};
        datar(buys);
        
    }
    public static void datar(int[]x){
        int n=x.length;
        int max=0;
        // Arrays.sort(x);
        // int j=0;
        for(int j=0;j<n-1;j++){
        for(int i=j+1;i<n;i++){
                max=Math.max(max,x[i]-x[j]);
            
        
            }  
        }
            System.out.println(max);
        }
    }

    
