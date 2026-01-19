package If_Else_Conditions;

public class Day41 {
    public static void main(String[] args) {
        String s = null;
        if (s != null && s.equals("Test"))
            System.out.println("Match");
        else
            System.out.println("No Match");
// Explanation: First condition prevents NullPointerException.
    }
}
