package Array.Copy_Merge_Concat_Arrays;

public class Array_Day35 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        int b [] = java.util.Arrays.copyOf(a, a.length);
        System.out.println(java.util.Arrays.toString(b));
        // Explanation: copyOf clones array.
    }
}
