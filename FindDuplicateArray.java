import java.util.Arrays;

public class FindDuplicateArray {
    
    public static void main(String[] args) {
        int num[]={1,3,4,5,2,6,7,8,9,10,1};
        System.out.println(FindDuplicate(num));
        
    }

    private static int FindDuplicate(int[] nums) {
        // for (int i = 0; i < num.length; i++) {
        //     for (int j = 0; j <i; j++) {
        //         if(num[i]==num[j])
        //         return num[i];
        //     }
        // }
        // return 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1])
            return nums[i];
        }
        return 0;

    }

}
