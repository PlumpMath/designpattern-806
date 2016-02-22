package pattern.visitor.tutorialspoint;

/**
 * Created by gauravs on 22/2/16.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
