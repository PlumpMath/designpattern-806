package pattern.observer.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
