package ForLoops;

public class For_Loop_Day30 {
    public static void main(String[] args) {
        int a [] ={1,2,3};
        for(int i = 0; i<a.length; i++)
        {
            a[i] = a[i+1];
            // Exception: ArrayIndexOutOfBoundsException at i=2
            // Explanation: tries to access a[3] — off-by-one bug; good interview error to spot.
        }
    }
}
