package pattern.visitor.oodesign;

/**
 * Created by gauravs on 22/2/16.
 */
public class GeneralReport implements IVisitor {

    private int customerNo;
    private int ordersNo;
    private int itemsNo;

    @Override
    public void visit(Customer customer) {
        customer.getOrders().forEach(order -> {ordersNo++;order.accept(this);});

    }

    @Override
    public void visit(Order order) {
        order.getItems().forEach(item -> {itemsNo++;item.accept(this);});

    }

    @Override
    public void visit(Item item) {
        System.out.println(item.getName());
    }

    @Override
    public void visit(CustomerGroup customerGroup) {

        customerGroup.getCustomers().forEach(customer -> {customerNo++;customer.accept(this);});
    }

    @Override
    public String toString() {
        return "GeneralReport{" +
                "customerNo=" + customerNo +
                ", ordersNo=" + ordersNo +
                ", itemsNo=" + itemsNo +
                '}';
    }
}
