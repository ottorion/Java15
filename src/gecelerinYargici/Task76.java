package gecelerinYargici;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task76 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] daysOfWeek = new String[7];

        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print("Please enter day " + (i + 1) + " of the week: ");
            daysOfWeek[i] = input.nextLine();
        }

        for (String day : daysOfWeek) {
            System.out.println(day);
        }
        }

    }