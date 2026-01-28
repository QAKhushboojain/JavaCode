package InheritancePolymorphism;

import java.util.Arrays;
import java.util.List;

public class Test47 {
    public static void main(String[] args) {
        List<Parent26> list = Arrays.asList(new Parent26(), new Child26());
        for(Parent26 p : list) p.show();
// Explanation: Collection holds superclass type but stores subclass objects — overridden methods run.
    }
}
