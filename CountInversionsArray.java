public class CountInversionsArray { 
    public static void main(String[] args) {
        long arr[]={2,4,1,3,5};
        int n=arr.length;
        
       // int count=CountInversion(arr,n);
       long count=inversionCount(arr,n);
System.out.println(count);
    }

    // private static int CountInversion(int[] arr, int n) {
    //     int count=0;
    //     for (int i = 0; i < arr.length-1; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
    //             if (arr[i] > arr[j])
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    static long inversionCount(long arr[], int N)
    {
        long[] temp = new long[N];
        long ans= MergeSort(arr, temp, 0, N-1);
        return ans;
        // Your Code Here
    }

    private static long MergeSort(long arr[], long temp[], int left, int right) {
        long invc = 0;
        if (left < right) {
        int n = right - left;
        int mid = n/2;
        if(n == 1) return 0;
        invc +=MergeSort(arr,temp,left,mid);
        invc +=MergeSort(arr,temp, mid+1,right);
        invc +=merge(arr,temp, left,mid+1,right);
        }
        return invc;
    }

    private static long merge(long[] arr, long[]temp, int left, int mid, int right) {
        int i,j,k;
        int count=0;
        i=left;
        j=mid;
        k=left;
        while((i<=mid-1)&&(j<=right))
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else
            {
                temp[k++]=arr[j++];
                count+=(mid-i);
            }
        }
        while(i<=mid-1)
        {
            temp[k++]=arr[i++];
        }
        while(j<=right)
        {
            temp[k++]=arr[j++];
        }
        return count;

    }
    
}
