package Duplicates_Frequency_Array;

public class Array_Day23_RemoveDuplicates {
    public static void main(String[] args) {
        int a [] = {1,2,2,3,3};
        int res [] = java.util.Arrays.stream(a).distinct().toArray();
        System.out.println(java.util.Arrays.toString(res));
       // Explanation: uses streams distinct.
        /* ✅ Java Stream API

Used for functional-style operations on data

✅ distinct()

Removes duplicates

✅ toArray()

Converts stream back to array */
    }
}
