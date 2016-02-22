package pattern.command.oodesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gauravs on 19/2/16.
 */
//Invoker
public class Agent {

    private List<Order> ordersQueue = new ArrayList();

    void placeOrder(Order order)
    {
        order.execute();
    }


}
