package ForLoops;

public class For_Loop_Day8 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[++i]);
            // Explanation: ++i increments before access → prints indices 1 and 3.
        }
    }
}
