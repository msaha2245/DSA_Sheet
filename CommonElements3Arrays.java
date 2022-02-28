import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements3Arrays {
    public static void main(String[] args) {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[]= {3, 4, 15, 20, 30, 70, 80, 120};
        int n1=A.length;
        int n2=B.length;
        int n3=C.length;
        ArrayList<Integer> res=commonElements(A,B,C, n1, n2, n3);
        System.out.println(res);

    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                int ele=A[i];
                res.add(A[i]);
                while (i<n1 && A[i]==ele)
                i++;
                while (j<n2 && B[j]==ele)
                j++; 
                while (k<n3 && C[k]==ele)
                k++;
            }
            else
            if(A[i]<B[j])
            i++;
            else if(B[j]<C[k])
            j++;
            else 
            k++;
        }
        return res;

    }
}
