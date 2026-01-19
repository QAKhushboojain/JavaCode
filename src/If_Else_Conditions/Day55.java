package If_Else_Conditions;

public class Day55 {
    public static void main(String[] args) {
        int n = 2;
        switch (n) {
            case 1:
                if (n > 0)
                    System.out.println("Positive");
                break;
            case 2:
                if (n % 2 == 0)
                    System.out.println("Even Number");
                break;
        }

    }
}
