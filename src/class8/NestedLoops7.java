package class8;

public class NestedLoops7 {
    public static void main(String[] args) {


        /* 0 1 2 3 4 5
        1 2 3 4 5
        2 3 4 5
         */
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(i*j+ " ");
            }System.out.println();
        }
    }


}




