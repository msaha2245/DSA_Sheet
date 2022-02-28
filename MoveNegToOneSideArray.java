public class MoveNegToOneSideArray {

    public static void main(String[] args) {
        int arr[]={-4,-21,53,4,51,-6,7,-8,9,-10};
        MoveNeg(arr);
    }

    private static void MoveNeg(int[] arr) {
        int temp;
        int p=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0)
                {
                    if(i!=p)
                    {
                        temp=arr[i];
                        arr[i]=arr[p];
                        arr[p]=temp;
                    }
                    p++;
                }

        }
        for (int j = 0; j < arr.length; j++) //printing the sorted array
        System.out.print(arr[j]+" ");
    }
    
}
