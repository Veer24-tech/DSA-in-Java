// best time to buy and sell stock

public class Stock {
    public static int maxProfit(int stockPrice[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<stockPrice.length;i++){
            if(buyprice<stockPrice[i]){
                int profit=stockPrice[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=stockPrice[i];

            }
        }
        return maxprofit;
    }
    public static void main( String args[]){
        int stockPrice[]={7,1,5,3,6,4};
      
        System.out.println(maxProfit(stockPrice));
      
    }
    
}
