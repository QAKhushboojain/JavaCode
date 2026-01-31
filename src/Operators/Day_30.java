package Operators;

public class Day_30 {
    static int incAndReturn(int[] a) {
            a[0]++;
            return a[0];
        }
        public static void main(String[] args) {
            int[] arr = {1};
            System.out.println(incAndReturn(arr));
            // Explanation: simple function modifies array element
    }
}
