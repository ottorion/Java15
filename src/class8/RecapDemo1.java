package class8;

public class RecapDemo1 {
    public static void main(String[] args) {

        // 10 8 6 4 2

        int number=10;
        while(number>=2){
            System.out.println(number);
            number-=2;  //same as number=number-2

        }
        System.out.println("******************");
        int number1=10;
        do {
            System.out.println(number1);
            number1=number1-2;  // same as number2-2=2
        }while (number1>=2);

    }
}
