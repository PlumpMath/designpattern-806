package pattern.visitor.tutorialspoint;

/**
 * Created by gauravs on 22/2/16.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
