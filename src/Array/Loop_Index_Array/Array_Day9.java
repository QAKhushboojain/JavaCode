package Array.Loop_Index_Array;

public class Array_Day9 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        for(int i = 0; i<a.length; i+=2){
            System.out.println(a[i]);
            // Explanation: step 2 prints indices 0 & 2.
        }
    }
}
