package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;

        /*while (summer){
            if (temp<=100){
                System.out.println("I love summer");

            }else {
                System.out.println("Its very hot");
                break;
            }temp+=5;*/
        while (temp <= 105) {
            if (temp <= 100) {

                System.out.println("I love summer because tempurutue is " + temp);
            } else {
                System.out.println("its very hot " + temp);


            }
            temp += 5;
        }
    }}