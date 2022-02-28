public class BuySellStocks {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int res=maxProfit(arr);
        int res1=maxProfit1(arr);
        System.out.println(res);
        System.out.println(res1);
    }

    private static int maxProfit1(int[] arr) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i]<minprice)
                minprice=arr[i];
                else if(arr[i]-minprice > maxprofit)
                maxprofit=arr[i]-minprice;
            }

        return maxprofit;
    }

    private static int maxProfit(int[] arr) {
        int profit=0;
        int maxp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[j]>arr[i])
                {
                    profit=arr[j]-arr[i];
                    if (profit>maxp)
                    maxp=profit;
                }
                
            }
        }
        return maxp;
    }

}
