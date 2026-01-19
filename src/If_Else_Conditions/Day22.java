package If_Else_Conditions;

public class Day22 {
    public static void main(String[] args) {
        boolean a = true, b = false, c = true;
        if (a && b || c)
            System.out.println("Condition True");
        else
            System.out.println("Condition False");
// Because (a && b) is false but || c → true.
    }
}
