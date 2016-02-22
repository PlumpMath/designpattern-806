package pattern.visitor.oodesign;

import java.util.ArrayList;

/**
 * Created by gauravs on 22/2/16.
 */
public class Order implements IVisitable {

    private String name;
    private ArrayList<Item> items = new ArrayList<>();

    private Order(String name)
    {
        this.name = name;
    }

    public Order createOrder(String name)
    {
        return new Order(name);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static Order createOrder(String name, Item item)
    {
        Order order = new Order(name);
        order.addItem(item);
        return order;
    }

    public void addItem(Item item)
    {
        items.add(item);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
