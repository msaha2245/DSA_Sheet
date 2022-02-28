public class MaxMinArray { 
    
    static void MaxMinArrayFunc( int arr[]){
        int max, min;
        max=arr[0];
        min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)max=arr[i];
            if (arr[i]<min) min=arr[i];
        }
            System.out.print("Max is: "+ max+ "  Min is: "+min);
}
    public static void main(String[] args) {
        int arr[]={-4,-21,53,4,51,6,7,8,9,10};
        MaxMinArrayFunc(arr);
        }
}
      // reverse(arr);  
        
    
