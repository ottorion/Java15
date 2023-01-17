package gecelerinYargici;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty= scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy= scan.nextBoolean();

        if (thirsty&&!sleepy){
            System.out.println("Looks like you need to drink water");
        }

        if (thirsty&&sleepy){
            System.out.println("Looks like you need to drink coffee");
        } if (!thirsty&&sleepy){
            System.out.println("Looks like you need to drink tea");
        }if (!thirsty&&!sleepy){
            System.out.println("Looks like you need to drink nothing");
        }
    }
}
