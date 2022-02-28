public class KthMaxMinArray{

    


    public static void main(String[] args) {
        int arr[]={71, 10, 14, 3, 20, 15};
        int k=3;
        KthMinMax(arr,k);


    }

    private static void KthMinMax(int[] arr, int k) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Kth Max term is:  "+ arr[arr.length-k]+ "  Kth Min term is:   " +arr[k-1]);
        // for (int j = 0; j < arr.length; j++) //printing the sorted array
        // System.out.print(arr[j]+" ");
    }
    
    
    
}