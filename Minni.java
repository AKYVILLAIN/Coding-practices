public class Minni {
    public static void main(String[]args){
        int []arr={4, 2, 3};
        int n=arr.length;
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
