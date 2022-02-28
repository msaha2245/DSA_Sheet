public class MaxProductSubArray {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, -1, 0};
        int n=arr.length;
        long result=MaxProduct(arr,n);
        System.out.println(result);
    }

    private static long MaxProduct(int[] arr, int n) {
        long maxP=arr[0];
        int minVal = arr[0];
        int maxVal = arr[0];
        if (arr[0]==0)
        {
        minVal=1;
        maxVal=1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0)
            {
                int temp = maxVal;
                maxVal = minVal;
                minVal =temp;
            
            }
            System.out.println(maxVal);
            System.out.println(arr[i]);
            maxVal = Math.max(arr[i], maxVal*arr[i]);
            minVal = Math.min(arr[i], minVal*arr[i]);

            maxP = Math.max(maxP, maxVal);
        }
        return maxP;
    } 
}
