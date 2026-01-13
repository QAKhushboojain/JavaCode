package Array;

public class Array_RememberThings {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        for(int i = 0; i<=a.length; i++)
        {
            System.out.println(a[i]);
            // ArrayIndexOutOfBoundsException
            //Because last valid index is 2.
        }
    }
}
