package pattern.observer.youtube;

/**
 * Created by gauravs on 19/2/16.
 */
public interface Subject {
    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();


}
