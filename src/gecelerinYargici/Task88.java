package gecelerinYargici;



public class Task88 {
String  name;
String breed;
String color;



    void bark() {
        System.out.println(name+" can bark");

    }

    void run() {
        System.out.println(name + " can run");
    }

    void play() {
        System.out.println(name + " can play");
    }

    public static void main(String[] args) {
        Task88 dog1 = new Task88();
        dog1.name = "husky";
        dog1.bark();
        dog1.run();
        dog1.play();

        Task88 dog2=new Task88();
        dog2.name="bulldog";
        dog2.bark();
        dog2.run();
        dog2.play();

        Task88 dog3= new Task88();
        dog3.name="labrador";
        dog3.bark();
        dog3.run();
        dog3.play();

    }}