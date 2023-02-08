package gecelerinYargici;

public class Task92 {

    public static void main(String[] args) {

        String s1="hello how are you";

        boolean lastLetter=s1.endsWith("u");
        System.out.println(lastLetter);

        boolean lastWord=s1.endsWith("world");
        System.out.println(lastWord);

        boolean lastWord1=s1.endsWith("are");
        System.out.println(lastWord1);

        boolean lastword2=s1.endsWith("you");
        System.out.println(lastword2);
    }
}
