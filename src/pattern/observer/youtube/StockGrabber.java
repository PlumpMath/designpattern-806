package pattern.observer.youtube;

import java.util.ArrayList;

/**
 * Created by gauravs on 19/2/16.
 */
public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;

    private double ibmPrice;
    private double aaplPrice;
    private double googprice;

    public StockGrabber()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver)
    {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver)
    {
        int index =observers.indexOf(deleteObserver);
        System.out.println("Observer " + (index+1) + " deleted");
        observers.remove(index);
    }

    @Override
    public void notifyObserver()
    {
        for(Observer observer:observers)
        {
            observer.update(ibmPrice, aaplPrice, googprice);
        }
    }

    public void setIBMPrice(double newIBMPrice)
    {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice)
    {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice)
    {
        this.googprice = newGOOGPrice;
        notifyObserver();
    }

}
