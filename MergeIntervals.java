import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
       
      Merge(arr);
        
    }

    private static void Merge(int[][] arr) {
        Arrays.sort(arr, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0])); //sorting array based on 1st element of each interval
        List<int[]> output_arr=new ArrayList<>();//created new list- output_arr to store the output since its size cant be determined
        int[] current=arr[0];//taking first interval from input arr as current interval
        output_arr.add(current);//adding first interval from current and saving it in output
        
        for (int[] interval : arr) {// for each interval in the input, we are running this for loop
            //int current_beg=current[0];// beginning element of the current interval
            int current_end=current[1];// ending element of the current interval
            int next_beg=interval[0];// next interval beginning
            int next_end=interval[1];// next interval ending


            if(current_end>=next_beg)
            {
                current[1]= Math.max(current_end, next_end);
            }
            else
            {
                current=interval;
                output_arr.add(current); 
            }
        }
     
        int arr2[][]=output_arr.toArray(new int[output_arr.size()][]);

        System.out.println(Arrays.deepToString(arr2));
    }
}
