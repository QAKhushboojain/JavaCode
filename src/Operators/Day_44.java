package Operators;

public class Day_44 {
    public static void main(String[] args) {
        int i = 1;
        int j = i++ + i;
        System.out.println(i + " " + j);
// Explanation: left→right:
//i++ yields 1 i->2
//second i is current 2 -> j = 1 + 2 = 3? Wait careful: Actually j = 1 + 2 = 3. So output should be 2 3.
//(Trainer: ALWAYS compute step-by-step. Many interview mistakes come from doing it in your head.)
    }
}
