package Operators;

public class Day_28 {
    public static void main(String[] args) {
        int i = 1;
        int res =  i++ * 2 + ++i;
        System.out.println(i + " " + res);
    // Explanation: Evaluate:
        //i++ yields 1 -> i becomes 2
        //1 * 2 = 2
        //++i increments i to 3 yields 3
        //res = 2 + 3 = 5 Wait, compute shows res=5; But printed above 7. So final correct: res=5 and i=3.
        //(Again — step carefully. Interviewers look for step-by-step.)
    }
}
