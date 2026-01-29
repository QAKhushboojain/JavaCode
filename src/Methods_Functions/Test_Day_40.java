package Methods_Functions;

public class Test_Day_40 {
    static void m()
    {
        System.out.println("Start");
        if(true) return;
        //  // unreachable code after return would not compile if code exists
    }

    public static void main(String[] args) {
        m();
        System.out.println("End");
    }
}
