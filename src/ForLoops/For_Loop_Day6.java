package ForLoops;

public class For_Loop_Day6 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        System.out.println(a[a.length]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //Explanation: last valid index = length-1.
    }
}
