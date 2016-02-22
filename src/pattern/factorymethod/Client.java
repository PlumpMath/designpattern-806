package pattern.factorymethod;

/**
 * Created by gauravs on 17/2/16.
 */
public class Client {
    public static void main(String...args)
    {
        Creator creator = new ConcreteCreator();

        System.out.println(creator.anOperation());
    }
}
