package Special_Tricky_Index_Array;

public class Array_Day29 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        for(int i = 0; i<a.length; ){
            System.out.println(a[i++]);
            // Explanation: post-increment returns original i then increments.
        }
    }
}
