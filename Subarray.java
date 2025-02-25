public class Subarray {
    public static void main(String []args){
        int[]arr={-2, 6, -3, -10, 0, 2};
        int maxpro=arr[0];
        int minpro=arr[0];
        int res=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=maxpro;
                maxpro=minpro;
                minpro=temp;
            }
            maxpro=Math.max(arr[i],maxpro*arr[i]);
            minpro=Math.min(arr[i],minpro*arr[i]);
            res=Math.max(res,maxpro);
            
        }
        System.out.println(res);
     
    }
    
}
