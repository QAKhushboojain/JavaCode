package Array.Very_Tricky_Array;

public class Array_Day52 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        int b [] = new int[5];
        System.arraycopy(a,0,b,1,a.length);
        System.out.println(java.util.Arrays.toString(b));
        // Explanation: arraycopy places a starting at index 1; other positions default 0.
    }
}
