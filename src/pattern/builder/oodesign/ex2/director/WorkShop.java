package pattern.builder.oodesign.ex2.director;

import pattern.builder.oodesign.ex2.builders.VehicleBuilder;

/**
 * Created by gauravs on 18/2/16.
 */
public class WorkShop {
    VehicleBuilder vehicleBuilder;
    public WorkShop(VehicleBuilder vehicleBuilder)
    {
        this.vehicleBuilder = vehicleBuilder;
    }
    public void prepareVehicle()
    {
        vehicleBuilder.buildHandle();
        vehicleBuilder.buildSeat();
        vehicleBuilder.buildTyre();
    }
}
