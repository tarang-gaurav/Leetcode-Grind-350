public class StockSell {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;      
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            int temp=prices[i]-min;
            profit=Math.max(temp,profit);
        }
        return profit;
    }

    public static void main(String[] agrs){
        StockSell t=new StockSell();
        int res=t.maxProfit(new int[]{2,7,11,15});
      
            System.out.println(res);
        
    }
}
