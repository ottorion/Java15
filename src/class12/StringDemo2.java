package class12;

public class StringDemo2 {
    public static void main(String[] args) {
//only converts the uppercase letters to lower case

        String str="Java is FUN 1212#$#$";
       String newStr= str.toLowerCase();
        System.out.println(newStr);

        String str2="I love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);


    }
}
