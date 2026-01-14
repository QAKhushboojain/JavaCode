package Very_Tricky_Array;

public class Array_Day51 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i++]);
            // Explanation: post-increment used in access; loop increments once in print and again in for; net effect prints odd-index elements.
        }
    }
}
