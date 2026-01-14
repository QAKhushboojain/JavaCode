package Array.Finding_Missing_Second_largest_Array;

public class Array_Day38 {
    public static void main(String[] args) {
        int a [] = {5,1,4,2,3};
        java.util.Arrays.sort(a);
        System.out.println(a[a.length-2]);
        // Explanation: after sort, second last is 2nd largest.

    }
}
