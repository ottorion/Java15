package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Scanner => name of the class
        scan is just a variable like we create primitive variables
        = => assigment operator
        System.in => tells the computer we want to read the data from keyboard




         */
        /*
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" Years old");

        System.out.println("please enter your weight");
        double weight= scan.nextDouble();
        System.out.println(" your weight is "+weight+" Kgs");

        System.out.println("are you hungry");
        boolean hungry= scan.hasNextBoolean();
        System.out.println("Hungry "+hungry);

        */

        /*
        System.out.println("please enter your gender");
        char gender=scan.next().charAt(0);// char type of input
        System.out.println("your gender is "+gender);
        */

        System.out.println("Please enter your name");
        String name=scan.next(); //when we have to take only one word as input
        System.out.println("your name is "+name);

        scan.nextLine(); // trick to make nextline method work after we have used any other method from
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("your full name is "+fullName);
        scan.close();// good practice



    }
}
