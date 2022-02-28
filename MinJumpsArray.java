public class MinJumpsArray {
    public static void main(String[] args) {
        int arr[]={2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(JumpA(arr));
    
    }


    private static int JumpA(int[] arr) {
            int n=arr.length;
       int count =0, curr_S=0, maxJ=0;
            for(int i=0;i<n-1;i++)
            {
                maxJ=maxJ>i+arr[i]?maxJ: i+arr[i];
                
                if(i == curr_S)
                {
                    count++;
                    curr_S= maxJ;
                }
                if(arr[i] == 0 && i == curr_S)
                return -1;
                
            }
            return count;
    }


}


// Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element. Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
// Note: Return -1 if you can't reach the end of the array.

// Input:
// N = 11 
// arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
// Output: 3 
// Explanation: 
// First jump from 1st element to 2nd 
// element with value 3. Now, from here 
// we jump to 5th element with value 9, 
// and from here we will jump to last. 

/*

// { Driver Code Starts
    import java.lang.*;
    import java.io.*;
    import java.util.*;
    class GFG
     {
        public static void main (String[] args) throws IOException
         {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine()); 
    
            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                System.out.println(new Solution().minJumps(arr));
            }
         }
         
    }
    // } Driver Code Ends
    
    
    class Solution{
        static int minJumps(int[] arr){
      int count=0;
            int i=0;
            int t=0;
            if (arr[0]==0)
                count=-1;
            else if (arr[0]>arr.length)
                count= 1;
            else 
            {
            while(i<arr.length)
            {
                if (arr[i]<=0) 
               {count=-1;
                break;} 
                else{
                    if (arr[i]> arr.length-i)
                    {
                        count++;
                        t=1;
                    }
                    else
                        {
                            for(int j=0; j<arr[i] ;j++)
                            {
                                    if (arr[i+j]==0)
                                    {
                                        t=1;
                                        break;
                                    }
                            }
                        }
                    if (t==1) 
                    break;
                    count++;
                    
                }
                i=i+arr[i];
            }
            
                
            }
            return count;
        }
    }

    */