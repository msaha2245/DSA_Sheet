public class MergeWithoutSpaceArray {
    public static void main(String[] args) {
       int arr1[] = {1, 3, 5, 7,100,500};
        int arr2[] = {0, 2, 6, 8, 9,20,50,501};
        int n=arr1.length;
        int m=arr2.length;
        Merge(arr1,arr2,n,m);
        for (int j = 0; j < arr1.length; j++) //printing the sorted array
        System.out.print(arr1[j]+" ");
        for (int j = 0; j < arr2.length; j++) //printing the sorted array
        System.out.print(arr2[j]+" ");
    }

    // private static void swap(int i, int j) {
    //     int temp=i;
    //     i=j;
    //     j=temp;
    // }

    private static void Merge(int[] arr1, int[] arr2, int n, int m) {
            int[] temp= new int[n+m];
            int p=0,q=0,last=0;
            for(int i=0;i<n+m;i++){
                if((p>n-1)||(q>m-1))
                break;
                else
                {
                     if(arr1[p]>arr2[q])
                    {
                        temp[i]=arr2[q];
                        q++;
                    }
                    else
                    {
                        temp[i]=arr1[p];
                        p++;
                    }
                }
                last=i;
            }
            
            if (p>n-1)
                    for(int i=q;i<m;i++)
                    {
                        temp[++last]=arr2[q];
                        q++;
                    }
            if (q>m-1)
                    for(int i=p;i<n;i++)
                        {
                            temp[++last]=arr1[p];
                            p++;
                        }

            for (int i = 0; i < temp.length; i++) {
                if(i<n)
                    arr1[i]=temp[i];
                else
                arr2[i-n]=temp[i];
            }
    }
}
