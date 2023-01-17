package gecelerinYargici;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the instructor");
        String name= scan.nextLine();
           switch (name){
               case "Ashgar":
                   System.out.println("Will take care of Java Assignment");
                   break;
               case "Moazzam":
                   System.out.println("Will take care of SDLC Assignment");
                   break;
               case "Weqas":
                   System.out.println("Will take care of Selenium Assignment");
                   break;
               case "Asel":
                   System.out.println("Will take care of every Assignment");
                   break;
               default:
                   System.out.println("Invalid instructor selected");

        }

    }
}
