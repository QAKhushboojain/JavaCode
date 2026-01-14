package Java_Specific_Pitfalls_Reference_equals_Array;

public class Array_Day48 {
    public static void main(String[] args) {
        int a [] = {1,2};
        int b [] = {1,2};
        System.out.println(a==b);
        // Explanation: == compares references; different objects.
    }
}
