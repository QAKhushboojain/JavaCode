package If_Else_Conditions;

public class Day42 {
    public static void main(String[] args) {
        int a = 5;
        if (a++ == 5)
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println(a);
// Explanation: a++ compares before increment, then increments.
    }
}
