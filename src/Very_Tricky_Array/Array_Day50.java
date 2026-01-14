package Very_Tricky_Array;

public class Array_Day50 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[++i]);
            // Explanation: pre-increment moves i before access: prints indices 1 & 3.
        }
    }
}
