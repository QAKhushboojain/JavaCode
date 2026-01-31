package Operators;

public class Day_33 {
    public static void main(String[] args) {
        String s = "A";
        s += 'B' + 'C';
        System.out.println(s);
        // Explanation: 'B' + 'C' is numeric addition (66 + 67 = 133 actually, check ASCII: 'B'=66 'C'=67 => 133). So s += 133 yields "A133". (Make sure to compute correct char codes.)
        //(Trainer: best to write s += "B" + "C" to concatenate.)
    }
}
