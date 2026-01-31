package Operators;

public class Day_34 {
    public static void main(String[] args) {
        String s = "A";
        s += "" + 'B' + 'C';
        System.out.println(s);
        // Explanation: forcing string concatenation with "" makes subsequent + concatenate strings.
    }
}
