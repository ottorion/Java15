package class7;

public class Task1 {

    /* create a boolean variable workday and assign true
    create int variable day and assign it to 1
    as long as it is workday print "I need a day off" and increase day
    once day is 6 print "I do not need a day off anymore"
     */
    public static void main(String[] args) {


        boolean workDay = true;
        int day = 1;
        while (workDay) {
            if (day <= 5) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I do not need a day off anymore");
                workDay = false;

            }
            day++;

        }

    }
}