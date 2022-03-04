import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int arr[]={90, 100, 78, 89};
        int res=FindMedian(arr, arr.length);
        System.out.println(res);
    }

    private static int FindMedian(int[] arr, int length) {
        Arrays.sort(arr);
        if (length%2==0)
            return ((arr[length/2]+arr[(length/2)-1])/2);
        else
            return(arr[(length-1)/2]);
    }
    
}
