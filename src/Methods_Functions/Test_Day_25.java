package Methods_Functions;

public class Test_Day_25 {
    static int [] shared = {1,2};
    static int [] get(){
        return shared;
    }

    public static void main(String[] args) {
        get()[0] = 5;
        System.out.println(shared[0]);
    }
}
