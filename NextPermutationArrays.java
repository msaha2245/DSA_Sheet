import java.util.Arrays;

public class NextPermutationArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,1};
        nextperm(arr);
    }

    /* private static void nextperm(int[] nums) {
        int p=-1;
        if ((nums==null)||(nums.length==1))
        return;
        else
        {
            int i=nums.length-2;
            while(i>=0 && nums[i]>nums[i+1])
            i--;// i+1 is the first peak of the array from the right
            if(i==0)// case when the array is in descending order
            {
                reverse(nums,0, nums.length-1);
            }
            else if(i>0)// array peak identified
            {
                int j=nums.length-1;// j is starting from the end
                while(nums[i]>=nums[j])
                j--;// case when array has peak and element before the peak is smaller than rest all the elements to the right of the peak
                //
                swap(nums, i, j);
            }
            reverse(nums,i+1, nums.length-1);
        }
        System.out.println(Arrays.toString(nums));

    }
    */
    static void nextperm(int[] A) {
        if(A == null || A.length <= 1) return;
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]) i--; // Find 1st id i that breaks descending order
        if(i >= 0) {                           // If not entirely descending
            int j = A.length - 1;              // Start from the end
            while(A[j] <= A[i]) j--;           // Find rightmost first larger id j
            swap(A, i, j);                     // Switch i and j
        }
        reverse(A, i + 1, A.length - 1);       // Reverse the descending sequence
        System.out.println(Arrays.toString(A));
    }
    

    private static void reverse(int[] nums, int i, int j) {
        while(i<j) 
        swap(nums, i++,j--);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    
}
