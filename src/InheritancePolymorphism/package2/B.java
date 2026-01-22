package InheritancePolymorphism.package2;

import InheritancePolymorphism.package1.A;

public class B extends A {
    //  B cannot access package-private A outside package -> compile error
    // (Compile-time error: A is not public in pkg1; cannot be accessed from outside package)
    //Explanation: package-private members/classes not visible outside package.
}
