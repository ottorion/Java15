package gecelerinYargici;


import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your gender: M or F" );
      char gender= scan.next().charAt(0);
        System.out.println("Please enter your age");

      int   age= scan.nextInt();



        if (age>25){
            if(gender=='F'){
                System.out.println("Woman");
            }else {
                System.out.println("Man");
            }
        }else {
            if (gender=='F'){
                System.out.println("Girl");
            }else{
                System.out.println("Boy");
            }
        }




    }
}
