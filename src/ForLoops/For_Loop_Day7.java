package ForLoops;

public class For_Loop_Day7 {
    public static void main(String[] args) {
        int a [] ={1,2,3};
        for(int i = 0; i<=a.length; i++)
        {
            System.out.println(i);
            // Explanation: printing i vs accessing a[i] — important tester distinction.
        }
    }
}
