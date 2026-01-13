package Loop_Index_Array;

public class Array_Day10 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        for(int i = 0; i<a.length; i--)
        {
            System.out.println(a[i]);
            // Importance Things -
            // i++ → condition should be i < length
            //i-- → condition should be i >= 0 and start from length-1
            // (behaviour: infinite loop / then ArrayIndexOutOfBoundsException)
            //Explanation: i-- will go negative; loop condition i < a.length always true for initial i=0 ⇒ infinite loop until error.
        }
    }
}
