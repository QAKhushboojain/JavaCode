package Copy_Merge_Concat_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_Day34 {
    public static void main(String[] args) {
        int a [] = {1,2};
        int b [] = {3,4,5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        System.out.println(Arrays.toString(c));
        // Explanation: concatenation using streams.
    }
}
