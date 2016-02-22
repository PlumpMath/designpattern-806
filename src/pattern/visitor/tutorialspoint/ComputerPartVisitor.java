package pattern.visitor.tutorialspoint;

/**
 * Created by gauravs on 22/2/16.
 */
public interface ComputerPartVisitor {
    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Keyboard keyBoard);

    void visit(Computer computer);
}
