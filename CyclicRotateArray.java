public class CyclicRotateArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Rotate(arr,5);
        rotate(arr,5);
        for (int j = 0; j < arr.length; j++) //printing the sorted array
        System.out.print(arr[j]+" ");
    }

    private static void Rotate(int[] arr, int n) {
        System.out.print(arr[n-1]+" ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void rotate(int arr[], int n)
    {
        int temp=arr[n-1];
        for (int i = n-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}
