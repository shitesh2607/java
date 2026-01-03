package OOPS.Polymorphism.runtime;


//Subclass overriding baseVehicle class
public class Car extends BaseVehicle{

    @Override
    void start(){
        System.out.println("Starting Car...");
    }
}
