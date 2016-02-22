package pattern.builder.oodesign.ex2.builders;

import pattern.builder.oodesign.ex2.product.Bike;

/**
 * Created by gauravs on 18/2/16.
 */
public class BikeVehicleBuilder extends VehicleBuilder {

    private Bike bike =new Bike();
    @Override
    public void buildTyre() {
        bike.setTyre("Bike::BuildTyre");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Bike::buildSeat");

    }

    @Override
    public void buildHandle() {
        bike.setHandle("Bike::buildHandle");
    }

    public Bike buildBike()
    {
        return bike;
    }
}
