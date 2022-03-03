import java.util.Arrays;

public class ArraySubset {
    public static void main(String[] args) {
        int a1[]={10, 5, 3, 23, 19};
        int a2[]={19, 5, 3};
        int n=a1.length;
        int m=a2.length;

        String res=isSubset(a1,a2,n,m);
        System.out.println(res);
    }

    private static String isSubset(int[] a1, int[] a2, int n, int m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i=0,j=0;
        while (i<n && j<m)
        {
            if (a1[i]==a2[j])
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }


        if (j==m)
        return "Yes";
        else
        return "No";
    }
    
}
