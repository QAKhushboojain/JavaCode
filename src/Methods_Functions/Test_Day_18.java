package Methods_Functions;

public class Test_Day_18 {
    static int fact(int n)
    {
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
        // Explanation: standard factorial recursion.
    }

}
