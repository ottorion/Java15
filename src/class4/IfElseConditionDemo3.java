package class4;

public class IfElseConditionDemo3 {
    public static void main(String[] args) {

        int day=9;// assign a value to a variable

        if (day==1){
            System.out.println(("monday"));//if block
        } else if (day==2) {
            System.out.println("tuesday");//else block
        } else if (day==3) {
            System.out.println("wednesday");
        } else if (day==4) {
            System.out.println("thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("saturday");
        } else if (day==7) {
            System.out.println("sunday");
        }else {
            System.out.println("Please enter a day between 1 and 7");
        }

    }
}
