package class4;

public class NestedIfDemo8 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;

        if (studyHard){

            System.out.println("we get the jobs");

          if (salary>100000){
              System.out.println("lets buy tesla");
          }else {
              System.out.println("lets buy toyota");
          }


        }else {
            System.out.println("It might take a little longer for us to get jobs");
        }
    }
}
