package Sum_Aggregates_forEach_Array;

public class Array_Day14 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int even = 0, odd = 0;
        for(int v :a)
        {
            if(v%2==0)
               even++;
             else
                odd++;
        }
        System.out.println("Even Numbers Count "+even);
        System.out.println("odd Numbers Count "+odd);
    }
}
