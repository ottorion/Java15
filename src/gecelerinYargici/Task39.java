package gecelerinYargici;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark= scan.nextInt();

        if (mark>=1&&mark<25) {
            System.out.println("Your grade is F");
        } if (mark>=25&&mark<45) {
            System.out.println("Your grade is E");
        } if (mark>=45&&mark<50){
            System.out.println("Your grade is D");
        }if (mark>=50&&mark<60){
            System.out.println("Your grade is C");
        }if (mark>=60&&mark<80){
            System.out.println("Your grade is B");
        }if (mark>=80&&mark<100){
            System.out.println("Your grade is A");
        }else {
            System.out.println("Please enter valid mark");
        }

                }
            }



