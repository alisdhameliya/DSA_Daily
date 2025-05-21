public class _q12_StockBuySell {
    public static int maxProfit(int prices[]){

        int buyprice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            buyprice = Math.min(prices[i], buyprice);

            profit = Math.max(prices[i]-buyprice,profit);
        }
        return profit;
    }
    public static void main(String[] args) {
        // int prices[] = {1,2,3,4,5};
        int prices[] = {7,6,4,3,2,1};
        System.out.println(maxProfit(prices));
    }
}
