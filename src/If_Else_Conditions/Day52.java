package If_Else_Conditions;

public class Day52 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        if (a > b ? a > c : b > c)
            System.out.println("X");
        else
            System.out.println("Y");
//  Because a > b is false → check b > c → false.
    }
}
