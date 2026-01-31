package Operators;

public class Day_38 {
    public static void main(String[] args) {
        int i = 0;
        int res = (i++ == 0) ? i++ : ++i;
        System.out.println(i + " " + res);
// Explanation: condition i++ == 0 true (i was 0, i->1), so result is i++ (returns 1 then i->2), so res=1, i=2.
    }
}
