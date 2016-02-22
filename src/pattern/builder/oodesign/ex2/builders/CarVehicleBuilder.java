package pattern.builder.oodesign.ex2.builders;

import pattern.builder.oodesign.ex2.product.Car;

/**
 * Created by gauravs on 18/2/16.
 */
public class CarVehicleBuilder extends VehicleBuilder {
    private Car car=new Car();
    @Override
    public void buildTyre() {
        car.setTyre("Car::buildTyre");
    }

    @Override
    public void buildSeat() {
        car.setSeat("Car::buildSeat");
    }

    @Override
   public void buildHandle() {
        car.setHandle("Car::buildHandle");
    }

    public Car buildCar()
    {
        return car;
    }
}
