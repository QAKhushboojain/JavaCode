package Operators;

public class Day_13 {
    public static void main(String[] args) {
        int i = 1;
        int k = (i = i + 5) + i++;
        System.out.println(i + " " + k);
        // Explanation: Evaluate left→right:
        //(i = i + 5) sets i=6, yields 6
        //i++ yields 6 then i becomes 7
        //k = 6 + 6 = 12
    }
}
