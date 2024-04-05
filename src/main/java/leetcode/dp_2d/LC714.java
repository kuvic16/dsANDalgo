package leetcode.dp_2d;

public class LC714 {


    int max = 0;
    public int maxProfit(int[] prices, int fee) {
        for(int i=0; i<prices.length; i++){
            calculateProfit(i, prices, fee, 0);
        }
        return max;
    }

    public int calculateProfit(int i, int[] prices, int fee, int sum){
        if(i >= prices.length) return sum;

        for(int j=i+1; j<prices.length; j++){
            if(prices[j] - prices[i] - fee > 0){
                int profit = prices[j] - prices[i] - fee;
                sum = calculateProfit(j+1, prices, fee, sum + profit);
                System.out.println(sum);
                if(sum > max) max = sum;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        LC714 lc714 = new LC714();
        int[] prices = {};
        int fee = 0;

//        prices = new int[]{1,3,2,8,4,9};
//        fee = 2;

        prices = new int[]{1,3,7,5,10,3};
        fee = 3;
//
//        prices = new int[]{1,4,6,2,8,3,10,14};
//        fee = 3;

        System.out.println(lc714.maxProfit(prices, fee));
    }
}
