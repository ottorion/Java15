package Homeworks;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type he name of countries please ");
        String[] countries = new String[5];
        countries[0] = scan.next();
        countries[1] = scan.next();
        countries[2] = scan.next();
        countries[3] = scan.next();
        countries[4] = scan.next();
        System.out.println("The counties are ");
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i]+",");}


        System.out.println("now you should type the capitals");

        String[] capitals = new String[5];
        capitals[0] = scan.next();
        capitals[1] = scan.next();
        capitals[2] = scan.next();
        capitals[3] = scan.next();
        capitals[4] = scan.next();
        System.out.println("The capitals are ");
        for (int j = 0; j < capitals.length; j++) {
            System.out.print(capitals[j]+",");}

    }
}
