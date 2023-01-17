package gecelerinYargici;


import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two strings and Please enter two numbers");
        String word1=input.next();
        String word2= input.next();
        int int1= input.nextInt();
        int int2= input.nextInt();

        if(word1.equals(word2)&&int1==int2){
            System.out.println("AND");




        }else if(word1.equals(word2)||int1==int2) {
            System.out.println("OR");

        }else  {
            System.out.println("NONE");
        }




        }



    }
