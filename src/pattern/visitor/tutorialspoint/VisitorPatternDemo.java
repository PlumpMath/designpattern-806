package pattern.visitor.tutorialspoint;

/**
 * Created by gauravs on 22/2/16.
 */
public class VisitorPatternDemo {
    public static void main(String...args)
    {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
