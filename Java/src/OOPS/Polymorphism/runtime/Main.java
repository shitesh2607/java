package OOPS.Polymorphism.runtime;

//-------------- We are achieving polymorphism on runtime by method overriding ---------------

public class Main {
    public static void main(String[] args) {
        BaseVehicle baseVehicle;

        // Assigning car object to the vehicle reference
        baseVehicle=new Car();
        baseVehicle.start();

        // Assigning car object to the vehicle reference
        baseVehicle=new Bike();
        baseVehicle.start();

    }
}

