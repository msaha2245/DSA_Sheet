public class ReverseArray { 
    
    static void ReverseArray1( int arr[]){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for (int j = 0; j < arr.length; j++) 
            System.out.print(arr[j]+" ");
}
    public static void main(String[] args) {
        int arr[]={4,1,3,4,5,6,7,8,9,10};
        ReverseArray1(arr);
        }
}
      // reverse(arr);  
        
    
