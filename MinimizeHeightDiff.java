import java.util.Arrays;

public class MinimizeHeightDiff {
    public static void main(String[] args) {
        int arr[]={3, 9, 12, 16, 20};

        MinDiff(arr,3);
    }

    private static void MinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        int res=max-min;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]+k>arr[arr.length-1]-k)
            max=arr[i-1]+k;
            else max=arr[arr.length-1]-k;
            if(arr[i]-k<arr[0]+k)
            min=arr[i]-k;
            else
            min=arr[0]+k;

            res=(res<max-min)?res:max-min;


        }
        System.out.println(res);
    }
}
