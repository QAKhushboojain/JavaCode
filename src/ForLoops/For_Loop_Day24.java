package ForLoops;

public class For_Loop_Day24 {
    public static void main(String[] args) {
        outer:
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {

                if(i == 1 && j == 1)
                    break outer;

                System.out.println(i + " " + j);
            }
        }
    }
}
