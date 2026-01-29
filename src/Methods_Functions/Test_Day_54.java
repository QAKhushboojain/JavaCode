package Methods_Functions;

public class Test_Day_54 {
    static StringBuilder m(StringBuilder sb)
    {
        sb.append("X"); return sb;
    }

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("A");
        StringBuilder r = m(b);
        System.out.println(b==r);
// Explanation: same reference returned.
    }

}
