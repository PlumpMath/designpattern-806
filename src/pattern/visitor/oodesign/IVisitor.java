package pattern.visitor.oodesign;

/**
 * Created by gauravs on 22/2/16.
 */
public interface IVisitor {
    public void visit(Customer customer);
    public void visit(Order order);
    public void visit(Item item);
    public void visit(CustomerGroup customerGroup);
}
