package class6;

public class WhileLoop7 {
    public static void main(String[] args) {


        //print below sequence with the help of loop
        // 1 2 3 4 6 7 8 9 11 12 13 14 16

        int number1 = 1;
        while (number1 <= 16) {
            if (number1 == 5 || number1 == 10 || number1 == 15) {
            } else {

                System.out.println(number1);
            }

            number1++;

        }
        System.out.println("*******************");

        int number2 = 1;
        while (number2 <= 16) {
            if (number2 % 5 == 0) {

            } else {
                System.out.println(number2);
            }
            number2++;

        }
    }
}
