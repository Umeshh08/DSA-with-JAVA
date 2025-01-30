package Array;

public class stocks {
    public static int BuyAndSellStocks( int Prices[]){

        int BuyingPrice = Integer.MAX_VALUE;
        int MAXprofit = 0;

        for(int i=0; i<Prices.length;i++){
            if(BuyingPrice<Prices[i]){
                int profit = (Prices[i]-BuyingPrice);
                MAXprofit = Math.max(MAXprofit, profit);

            }
           else{
            BuyingPrice = Prices[i];
            
           }        
        }
    return MAXprofit;
    }

    public static void main(String[] args) {
        int Prices[] = { 5, 1, 8, 4, 3, 10 };
        System.out.println(BuyAndSellStocks(Prices));

    }

}

