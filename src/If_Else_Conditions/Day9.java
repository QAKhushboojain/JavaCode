package If_Else_Conditions;

public class Day9 {
    public static void main(String[] args) {
        int a = 5;
        if (a < 10 || a++ > 10){
            System.out.println(a);
        }
//  a < 10 true → second part not checked (short-circuit).
    }
}
