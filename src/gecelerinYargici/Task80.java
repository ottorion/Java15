package gecelerinYargici;

public class Task80 {
    public static void main(String[] args) {
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                double num = a[i][j] * 2;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }}