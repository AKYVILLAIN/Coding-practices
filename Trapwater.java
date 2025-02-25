
public class Trapwater {
    public static void main(String[]args){
        // List<Integer>ok=new heightayList<>();
        // List<Integer>kk=new heightayList<>();
        int[]height={2, 1, 5, 3, 1, 0, 4};
        int res=cy(height);
        System.out.println(res);
    
    }

        public static int cy(int[]height){
        int[]left=new int[height.length];
        int[]right=new int[height.length];
        int k =height[0];
        int l=height[height.length-1];
        for(int i=0;i<height.length;i++){
            if(k>=height[i]){
                left[i]=k;
            }else{
                k=height[i];
                left[i]=k;
            }
        }
        for(int j =height.length-1;j>=0;j--){
            // for(int i=0;i<right.length;i++){}
            
            if(l>=height[j]){
                right[j]=l;
            }else{
                l=height[j];
                right[j]=l;
            }
        }
        int sum=0;

        for(int i=0;i<height.length;i++){
            int height2=(Math.min(left[i],right[i])-height[i]);
            sum+=height2;
        }
        return sum;
        
    }}
    

