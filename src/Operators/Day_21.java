package Operators;

public class Day_21 {
    public static void main(String[] args) {
        int i = 2;
        int x = i++ + i++ + ++i;
        System.out.println(i + " " + x);

        // Explanation: Evaluate left→right:
        //i++ yields 2 (i->3)
        //next i++ yields 3 (i->4)
        //++i increments to 5? Wait need to re-evaluate: After two post increments i becomes 4. Then ++i -> i becomes 5 and yields 5. So x = 2 + 3 + 5 = 10 and final i=5.
        //Important: These chained increments are error-prone — compute step-by-step. (Depending on initial values this can be a trick Q.)
        //(Trainer tip: if asked by interviewer, show step table — they are testing process.)
    }
}
