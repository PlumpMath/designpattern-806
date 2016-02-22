package pattern.command.oodesign;

/**
 * Created by gauravs on 19/2/16.
 */
public class Client {
    public static void main(String...args)
    {
        StockTrade stockTrade = new StockTrade();
        BuyStockOrder buyStockOrder=new BuyStockOrder(stockTrade);
        SellStockOrder sellStockOrder = new SellStockOrder(stockTrade);

        Agent agent = new Agent();
        agent.placeOrder(buyStockOrder);
        agent.placeOrder(sellStockOrder);
    }
}
