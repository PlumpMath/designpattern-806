package pattern.builder.oodesign.ex2.client;

import pattern.abstractfactory.oodesign.Client;
import pattern.builder.oodesign.ex2.builders.CarVehicleBuilder;
import pattern.builder.oodesign.ex2.builders.VehicleBuilder;
import pattern.builder.oodesign.ex2.director.WorkShop;
import pattern.builder.oodesign.ex2.product.Vehicle;

/**
 * Created by gauravs on 18/2/16.
 */
public class Manufacturer {
    public static void main(String args[])
    {
        CarVehicleBuilder vehicleBuilder = new CarVehicleBuilder();
        WorkShop workShop = new WorkShop(vehicleBuilder);
        workShop.prepareVehicle();
        Vehicle v = vehicleBuilder.buildCar();
        System.out.println(v.getHandle());
        System.out.println(v.getSeat());
        System.out.println(v.getTyre());
    }
}
