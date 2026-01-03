package OOPS.Polymorphism.runtime;

//Subclass overriding baseVehicle class
public class Bike extends BaseVehicle{

    @Override
    void start(){
        System.out.println("Starting Bike..");
    }
}
