package gecelerinYargici;



import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {


       Scanner scan=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
       boolean isSunny=true;
       isSunny = scan.nextBoolean();

       if (isSunny){
           System.out.println("It is a sunny day, I should go somewhere!");
           System.out.println("What is the temperature outside?");

       }else {
           System.out.println("I stay home and practice Java!");
       }
        int temperature=85;
        temperature= scan.nextInt();
           if(temperature>=85) {


           System.out.println("I am going to beach!");
       }if (temperature<85){
            System.out.println("I am going to park!");
        }

    }





    }

