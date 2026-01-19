package ForLoops;

public class For_Loop_Day76 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        for (int n : arr) {
            if (n == 15)
                break;
            System.out.println(n);
        }

    }
}
