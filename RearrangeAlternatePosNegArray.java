public class RearrangeAlternatePosNegArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, -4, -1, 4};
        rearrange(arr);
    }
    public static void RightRotate(int arr[], int from, int to)
    {
        int temp=arr[to];
        for (int i = to; i>from; i--) {
            arr[i]=arr[i-1];
        }
        arr[from]=temp;
    }
    private static void rearrange(int[] arr) {
        int wrongIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (wrongIndex!=-1)
            {
                if ((arr[wrongIndex]>=0 && arr[i]<0)|| (arr[wrongIndex]<0 && arr[i]>=0))
                {
                    RightRotate(arr, wrongIndex, i);
                }
                if (i-wrongIndex>=2)
                wrongIndex+=2;
                else
                wrongIndex=-1;
            }
            else
            {
                if((arr[i]<0 && i%2==1)||(arr[i]>0 && i%2==0))
                wrongIndex=i; 
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }

}
}
