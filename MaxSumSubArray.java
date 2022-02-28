public class MaxSumSubArray {

    public static void main(String[] args) {
        int arr[] = { 2, -2, 3, -2, 5 };
        MaxSum(arr, 5);
    }
    // this is also called kandanes algorithm

    private static void MaxSum(int[] arr, int n) {
        int Maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > Maxsum)
                Maxsum = sum;
            if (sum < 0)
                sum = 0;
        }
        System.out.println(Maxsum);
    }

}
