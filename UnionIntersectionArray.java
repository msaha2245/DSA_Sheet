public class UnionIntersectionArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={3,4,5,6,7};
        Union(a,b,5,5);
        Intersection(a,b,5,5);
    }

    private static void Intersection(int[] a, int[] b,int m,int n) {
        int i=0,j=0;
        System.out.print("Intersection= ");
        while(i<m && j<n)
        {
            if (a[i]<b[j])
            
            {
                i++;
            }
            else if(b[j]<a[i])
            {
                j++;
            } 
            else if (a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
  }

    private static void Union(int[] a, int[] b,int m,int n) {
        int i=0,j=0;
        System.out.print("Union= ");
        while(i<m && j<n)
        {
            if (a[i]<b[j])
            
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(b[j]<a[i])
            {
                System.out.print(b[j]+" ");
                j++;
            } 
            else if (a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<m)
        {
            System.out.print(a[i]+" ");
            i++;
        }

        while(j<n)

       { 
           System.out.print(b[j]+" ");
            j++;    
        }
    }
    
}
