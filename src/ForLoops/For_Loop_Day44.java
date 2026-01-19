package ForLoops;

public class For_Loop_Day44 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while(i++ < 2);
// Explanation: post-increment in condition affects values — classic trick (always double-check).
    }
}
