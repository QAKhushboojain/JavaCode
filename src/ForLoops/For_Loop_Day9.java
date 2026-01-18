package ForLoops;

public class For_Loop_Day9 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i++]);
            // Explanation: post-increment used inside access; outer loop also increments → net step of 2.
        }
    }
}
