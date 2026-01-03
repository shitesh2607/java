package OOPS.Polymorphism;

public class Vehicle {

//    Method to start a vehicle with basic information
    void start(String vehicleType){
        System.out.println("Starting Vehicle: "+ vehicleType);
    }
//    Overloaded method to start a vehicle with extra information
    void start(String vehicleType, int speed){

        System.out.println("Starting vehicle:" + vehicleType +" with " + speed +" speed per hour.");
    }
}
