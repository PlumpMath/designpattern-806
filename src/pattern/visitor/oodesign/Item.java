package pattern.visitor.oodesign;

/**
 * Created by gauravs on 22/2/16.
 */
public class Item implements IVisitable {

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private Item(String name)
    {
        this.name=name;
    }

    public static Item createItem(String name)
    {
        return new Item(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
