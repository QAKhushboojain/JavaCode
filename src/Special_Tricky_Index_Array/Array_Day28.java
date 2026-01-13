package Special_Tricky_Index_Array;

public class Array_Day28 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[++i]);
            // Explanation: pre-increment increments i before access → prints a[1], a[3].
        }
    }
}
