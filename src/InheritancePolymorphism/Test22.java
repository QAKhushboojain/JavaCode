package InheritancePolymorphism;

import If_Else_Conditions.Day2;

public class Test22 {
    public static void main(String[] args) {
        P[] arr = { new D(), new D1(), new P() };
        for(P p: arr) p.show();
// Explanation: Each object's overridden method runs.
    }
}
