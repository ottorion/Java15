package class5;

public class LogicalOperators3 {
    public static void main(String[] args) {

        /*if the score in all the subjects are greater
        than 90 print brilliant student otherwise print you need to work hard */


        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;
/*
       if (mathScore>90){
           if (historyScore>90){
               if (scienceScore>90){
                   System.out.println("you are a brilliant student");
               }
                   else{
                   System.out.println("you need to work harder");
                   */
        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("you are a brilliant student");
               }else{
            System.out.println("you need to work harder");
           }
       }



    }

