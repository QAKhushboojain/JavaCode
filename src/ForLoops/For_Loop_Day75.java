package ForLoops;

public class For_Loop_Day75 {
    public static void main(String[] args) {
        int[] arr = {10, 0, 20, 0, 30};
        for (int n : arr) {
            if (n == 0)
                continue;
            System.out.println(n);
        }

    }
}
