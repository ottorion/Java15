package class14;

public class task4 {
    public static void main(String[] args) {


       /* StringBuilder st=new StringBuilder("This is sentence I want to reverse");
        System.out.println(st.reverse());
        String str= st.toString();//converting a StringBuilder to string so that we can
        //call methods from string
        */

   String str="This is sentence i want to reverse";
    String [] arr=str.split(" ");

    for (String word:arr){
        System.out.print(new StringBuilder(word).reverse()+" ");


    /*for (String word:arr){
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));


        } System.out.print(" ");
*/
    }
       /* System.out.println(word);
        String word="This";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
*/

        }
    }



