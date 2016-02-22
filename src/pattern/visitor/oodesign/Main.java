package pattern.visitor.oodesign;

import pattern.command.oodesign.*;

/**
 * Created by gauravs on 22/2/16.
 */
public class Main {
    public static void main(String...args)
    {
        Item item = Item.createItem("Pizza");
        Order order = Order.createOrder("Pizza Order", item);
        order.addItem(Item.createItem("Burger"));
        Customer customer = Customer.createCustomer("Gauravee");
        customer.addOrder(order);
        CustomerGroup customerGroup = new CustomerGroup();
        customerGroup.addCustomer(customer);

        GeneralReport generalReport=new GeneralReport();
        generalReport.visit(customerGroup);
        System.out.println(generalReport);
    }
}
