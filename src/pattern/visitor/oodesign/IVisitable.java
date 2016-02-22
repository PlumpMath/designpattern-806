package pattern.visitor.oodesign;

/**
 * Created by gauravs on 22/2/16.
 */
public interface IVisitable {
    public void accept(IVisitor visitor);
}
