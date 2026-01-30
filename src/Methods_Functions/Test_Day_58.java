package Methods_Functions;

public class Test_Day_58 {
    static int callCount = 0;
    static int f(){
        callCount++;
        return callCount;
    }
    static void print(){
        System.out.println(f() + " " + f());
    }

    public static void main(String[] args) {
        print();
        // Explanation: left-to-right evaluation: first f() returns 1, second returns 2 → prints 1 2
    }
}
