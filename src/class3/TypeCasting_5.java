package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
       long number=125l;
       byte shorterNumber=(byte) number;
       float f=10.5f;
       int num=(int) f;
        System.out.println(shorterNumber);
        System.out.println(num);
/*
byte
short
int
long
float
double
if we try to store the contents from a smaller box to a larger box java does not complain because
the content fits easily into larger box but if we try the otherway around we get an error and
we need to type cast it to store the contents
 */
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int) eggs;

        System.out.println(wholePart);


    }
}
