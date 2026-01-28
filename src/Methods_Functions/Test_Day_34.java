package Methods_Functions;

public class Test_Day_34 {
    static void change(StringBuilder sb) {
        sb.append("X");
    }

    public static void main(String[] a) {
        StringBuilder sb = new StringBuilder("A");
        change(sb);
        System.out.println(sb);
        // Explanation: StringBuilder is mutable.
    }
}
