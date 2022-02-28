import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int arr[]={4, 2, -3, 1, 6};
        int n=arr.length;
        boolean res=ZeroSum(arr, n);
        if (res== true) System.out.println("Yes");
        else System.out.println("No");
    }

    private static boolean ZeroSum(int[] arr, int n) {
        Set<Integer> hs = new HashSet<Integer>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;
            hs.add(sum);

        }
        return false;
    }
}

/*If we consider all prefix sums, we can

notice that there is a subarray with 0

sum when :

1) Either a prefix sum repeats or

2) Or prefix sum becomes 0.



Prefix sums for above array are:

1, 5, 3, 1, 6, 2, 5



Since prefix sum 1 repeats, we have a subarray

with 0 sum. */