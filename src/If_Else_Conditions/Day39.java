package If_Else_Conditions;

public class Day39 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        if (s1 == s2)
            System.out.println("Same");
        else
            System.out.println("Different");
        // Explanation: == compares references, not content.

    }
}
