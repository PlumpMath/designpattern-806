package pattern.visitor.oodesign;

import java.util.ArrayList;

/**
 * Created by gauravs on 22/2/16.
 */
public class CustomerGroup implements IVisitable {

    private ArrayList<Customer> customers = new ArrayList<>();
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
