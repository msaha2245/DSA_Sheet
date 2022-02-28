import java.util.ArrayList;
import java.util.Arrays;

public class FactorialtoArraylist {
    public static void main(String[] args) {
        int n=5;
        // ArrayList<Integer> res=factorial(n);
        System.out.println(Arrays.toString(factorial(n).toArray()));
        System.out.println(Integer.MAX_VALUE);
    }
    static ArrayList<Integer>  factorial(int N){
        //code here
        int res[] = new int[500];

        // Initialize result
        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x<= N; x++) {
            res_size = multiply(x, res, res_size);
        }

        ArrayList<Integer> result=new ArrayList<>();
      
        for (int i = res_size - 1; i >= 0; i--)
            result.add(res[i]);
            
            return result;
        // System.out.println("Factorial of given number is ");
        // for (int i = res_size - 1; i >= 0; i--)
        //     System.out.print(res[i]);
        
    }
    private static int  multiply(int x, int[] res, int res_size ) {
        int carry=0;
        int prod=1;
        for (int i = 0; i < res_size; i++) {
            prod= res[i]* x +carry;
            res[i] = prod % 10; // Store last digit of   'prod' in res[]
            carry = prod/10; 
        }
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
    // static long fact(int N)
    // {
    //     if(N==0)
    //     return 1;
    //     else return (N * fact(N-1));
    // }
}
