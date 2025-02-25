public class Containing {
    public static void main(String[]args){
        int[]arr={3, 1, 2, 4, 5};
        int n =arr.length;
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=n-1;
        while(left<right){
                int height=Math.min(arr[left],arr[right]);
                int width=right-left;
                int area=height*width;
                max=Math.max(max,area);
                if(arr[left]<arr[right]){
                left++;}
                else{
                    right--;}

            }
        
        System.out.println(max);
    }
    
}
