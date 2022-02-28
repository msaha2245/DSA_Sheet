import java.util.HashMap;
public class CountPairsWithSameSum {
    public static void main(String[] args) {
        int arr[]={1, 1, 1, 1};
        int N=arr.length;
        int k=2;
        int result =getPairsCount(arr, N, k);
        System.out.println(result);
    }

    private static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int count=0;
        for(int num : arr){
            count+= map.getOrDefault(k-num, 0); 
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }
        return count;
    }
}
