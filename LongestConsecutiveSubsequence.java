import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[]={6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
        int res=findLongestConseqSubseq(arr,arr.length);
        System.out.println(res);
    }
    static int findLongestConseqSubseq(int arr[], int N)
    {
        int count=1;
        int maxcount=1;
         Set <Integer> set= new HashSet<>();
        for (Integer e : arr) {
             set.add(e);
         }  
         Integer[] arr2=new Integer[set.size()];
        set.toArray(arr2);
        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length-1; i++) {
            if (arr2[i+1]==arr2[i]+1)
            {
                count++;
                maxcount=(count>maxcount)?count:maxcount;
            }
            else
            count=1;
        }
        return maxcount;
      //Your code here
    }
}
