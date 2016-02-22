package pattern.command.oodesign;

/**
 * Created by gauravs on 19/2/16.
 */
public class SellStockOrder implements Order {
    private StockTrade stock;

    public SellStockOrder(StockTrade stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
