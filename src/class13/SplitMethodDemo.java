package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {

        String str = "I like java. I write alot of code daily. I am from batch 15.";
        String[] strArr = str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2].trim());

        //whenever we are working with arrays we use the lenght and whenever we are working with strips
        //we use the lenght()

    }
    }

