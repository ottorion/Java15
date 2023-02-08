package class11;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

                /* type some thing like this
        8
        8 8
        8 8 8
        8 8 8 8
        8 8 8
        8 8
        8
         */
        for (int i = 0; i <=4 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
