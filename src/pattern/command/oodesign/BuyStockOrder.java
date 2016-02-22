package pattern.command.oodesign;

/**
 * Created by gauravs on 19/2/16.
 */
public class BuyStockOrder implements Order
{

    private StockTrade stockTrade;

    public BuyStockOrder(StockTrade st)
    {
        stockTrade = st;
    }

    public void execute()
    {
        stockTrade.buy();
    }

}
