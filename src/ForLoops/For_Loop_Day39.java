package ForLoops;

public class For_Loop_Day39 {
    public static void main(String[] args) {
        // (O(n^2) pair sums)
        int a[] = {1, 2, 3, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.println(a[i] + "," + a[j]);
                // Explanation: pair combinations, test complexity O(n^2).
            }
        }
    }
}
