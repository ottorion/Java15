package gecelerinYargici;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean yes = scan.nextBoolean();

        if (yes){
            System.out.println("What is your credit score?");
            int score= scan.nextInt();
            if (score<600) {
                System.out.println("Your eligibility is not eligible");
            } else if (score<700&&score>600) {

                System.out.println("Your eligibility is maybe eligible");
            } else if (score>701&&score<800) {

                System.out.println("Your eligibility is eligible");
            } else if (score > 800) {


            System.out.println("Your eligibility is Definitely eligible");
                        }



        }else {
            System.out.println("Unknown");






        }




    }}

