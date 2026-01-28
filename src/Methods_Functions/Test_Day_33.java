package Methods_Functions;

public class Test_Day_33 {
    static void change(String s){ s = s + "X"; }
    public static void main(String[] a){
        String s = "A";
        change(s);
        System.out.println(s);
        // Explanation: strings immutable; reassigning local param doesn't change original.
    }
}
