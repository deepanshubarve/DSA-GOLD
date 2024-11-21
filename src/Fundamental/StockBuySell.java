public class StockBuySell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(sharemarket(prices));
    }

    public static int sharemarket(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for(int i =0;i<n;i++ ){
            if(buyPrice<prices[i]){
                int Profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,Profit);
            }else{
                 buyPrice =prices[i];
            }
        }
        return maxProfit;
    }
}
