package pattern.visitor.oodesign;

import javax.crypto.spec.IvParameterSpec;
import java.util.ArrayList;

/**
 * Created by gauravs on 22/2/16.
 */
public class Customer implements IVisitable {
    private String name;
    private ArrayList<Order> orders = new ArrayList<>();
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public void addOrder(Order order)
    {
        orders.add(order);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {this.name = name;}

    private Customer (String name)
    {
        this.name=name;
    }

    public static Customer createCustomer(String name)
    {
        return new Customer(name);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
