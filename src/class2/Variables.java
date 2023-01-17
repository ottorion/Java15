package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a bos in the computer's memory.
        We are calling it box1 if we need the information that we ar storing inside this box
        we can simply say to the computer give us the contents of box1
        int=>what type of data we want to store
        box1=> is the name of the box
        = sign will take what ever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        // if we are printing something from a box we don't need""
        System.out.println(box1); // bring the contests of box1 and print them on the console
        /* To store whole numbers(numbers without decimals points) we have 4 different types of boxes
            for example numbers like 10 20 4000
            1) byte 2) short 3) int 4) long

         */
        byte box2=127; // range for byte is -128 to 127 if we need to store larger number we should try short
        byte box3=-128;
        short box4=32767; //limit of the short box
        int biggerBox=1321564654; //most common type of box
        long maxBox=1231234230490l;
        short myBox=10000;
        System.out.println(myBox);
    }
}
