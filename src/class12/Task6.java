package class12;

public class Task6 {
    public static void main(String[] args) {


        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany", "United Kingdom", "France", "Spain"},
                {"China", "India", "Japan", "Russia"},
                {"Egypt", "Nigeria", "South Africa", "Ethiopia"}
        };
          int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;

            }System.out.println();
        }
        System.out.println("Total countries "+counter);



    }
}
