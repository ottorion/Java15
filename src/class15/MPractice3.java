package class15;

public class MPractice3 {
    /*
    create a method  that takes and array of integers sum all the elements from the array
    and return the sum
return type ==> int
name of Method==>arraySum
parameters==> int [] arr
     */



    int arraySum(int [] arr) {

        int sum = 0;
        for (int num : arr) {

            sum += num;
        }
        return sum;

    }

}