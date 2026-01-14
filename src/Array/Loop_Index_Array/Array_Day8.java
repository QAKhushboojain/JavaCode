package Array.Loop_Index_Array;

public class Array_Day8 {
    public static void main(String[] args) {
        int a [] = {1,3,5,7,9};
        for(int i = 0; i<a.length; i++)
        {
            i++;
            System.out.println(a[i]);
            // Explanation: outer i increments twice per iteration — prints a[1], a[3].
            /* First iteration

Start: i = 0
Inside loop: i++ → now i = 1
Print: a[1] = 3
End of loop: for-loop does i++ → now i = 2 */

            /* Second iteration

i = 2
Inside loop: i++ → now i = 3
Print: a[3] = 7
End of loop: for-loop does i++ → now i = 4 */

            /* Third iteration

i = 4
Inside loop: i++ → now i = 5
Print: a[5] ❌ → ArrayIndexOutOfBoundsException
Because valid indexes are only:
0 to 4 */
        }
    }
}
