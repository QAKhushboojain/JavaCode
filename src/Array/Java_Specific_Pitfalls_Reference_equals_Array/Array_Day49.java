package Array.Java_Specific_Pitfalls_Reference_equals_Array;

public class Array_Day49 {
    public static void main(String[] args) {
        int a [] = {1,2};
        int b [] = a;
        System.out.println(a==b);
        b[0] = 5;
        System.out.println(a[0]);
        // Explanation: b references same array; changes reflect.
    }
}
