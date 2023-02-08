package class10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[5];
        numbers[0]=40;
        numbers[1]=50;
        numbers[2]=60;
        numbers[3]=70;
        numbers[4]=80;

        System.out.println(Arrays.toString(numbers));
    }
}
