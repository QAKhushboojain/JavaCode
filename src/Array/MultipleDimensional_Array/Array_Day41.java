package Array.MultipleDimensional_Array;

public class Array_Day41 {
    public static void main(String[] args) {
        int m [] [] = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i = 0; i<m.length; i++)
        {
            System.out.println(m[i][i]);
            // Explanation: main diagonal elements.
        }
    }
}
