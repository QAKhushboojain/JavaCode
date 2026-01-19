package ForLoops;

public class For_Loop_Day29 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        for(int i = 0; i<a.length; i++)
        {
            a[i] = a[i]*2;
            System.out.println(a[i] + " ");
            // Explanation: in-place modification
        }
    }
}
