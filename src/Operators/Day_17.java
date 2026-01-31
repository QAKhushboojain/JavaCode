package Operators;

public class Day_17 {
    public static void main(String[] args) {
        for(int i = 0; i<5 ; i++)
        {
            System.out.println(i++ + " ");
            // Explanation: Each loop iteration prints i++ (returns old i) then outer i++ in header increments again -> net +2 each iteration.
        }
    }
}
