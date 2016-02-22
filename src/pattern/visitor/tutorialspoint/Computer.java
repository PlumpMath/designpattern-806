package pattern.visitor.tutorialspoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gauravs on 22/2/16.
 */
public class Computer implements ComputerPart {

    List<ComputerPart> computerPartArrayList;

    public Computer()
    {
        computerPartArrayList = Arrays.<ComputerPart>asList(new Mouse(), new Monitor(), new Keyboard());
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartArrayList.stream().forEach(computerPart -> {computerPart.accept(computerPartVisitor);});
        computerPartVisitor.visit(this);

    }
}
