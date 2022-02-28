public class Sort012Array {


    public static void main(String[] args) {
        int arr[]={0,0,0,1,2,1,2,1,1,1,1,1,2,0};
        int count0=0;
        int count1=0;
        int count2=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
            count0++;
            else if (arr[i]==1)
            count1++;
            else if(arr[i]==2)
            count2++;
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        for (int i = 0; i < count0; i++) 
        arr[i]=0;
        for (int i = count0; i < count0+count1; i++) 
        arr[i]=1;
        for (int i = count0+count1; i < count0+count1+count2; i++) 
        arr[i]=2;

        // for (int i = 0; i < arr.length; i++)
        // {
        // if(i<count0)    
        // arr[i]=0;
        // else if (i+count0<count1)
        // arr[i]=1;
        // else if(i+count0+count1 < count0+count1+count2)
        // arr[i]=2;
        // }
        for (int j = 0; j < arr.length; j++) //printing the sorted array
        System.out.print(arr[j]+" ");
    }
    
}
