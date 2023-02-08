package class12;

public class CarTester {
    public static void main(String[] args) {
        //create the object of the class
        Car bmw=new Car();
        bmw.make="Bmw";
        bmw.model="I7";
        bmw.year=2023;
        bmw.moveForward();
bmw.applyBreaks();
        //create two classes pf your choice and call
        //the methods from those classes

        Car audi=new Car();
        audi.model="E-Tron";
        audi.make="Audi";
        audi.year=2022;
        audi.color="Black";
        audi.moveForward();
    }
}
