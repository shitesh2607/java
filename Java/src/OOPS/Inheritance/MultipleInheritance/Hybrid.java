package OOPS.Inheritance.MultipleInheritance;


public class Hybrid implements Dog ,Cat{
    @Override
    public void sound(){
        //YOu can define∈your simple logic here
        Dog.super.sound(); //Calls dog sound
    }
    public static void main(String[] args) {
        Hybrid hybrid= new Hybrid();
        hybrid.sound(); //Crete ambiguity , should it create dog's or cat sound()?
    }
}
