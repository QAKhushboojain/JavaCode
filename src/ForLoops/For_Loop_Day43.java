package ForLoops;

import java.util.*;

public class For_Loop_Day43 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer x = it.next();
            if (x == 2) {
                it.remove();   // safe removal
            }
        }

        System.out.println(list);
        // Explanation: modifying collection during for-each triggers exception.
    }
}
