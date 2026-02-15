package Static_Non_Static_Behavior;

public class A21 {
    static int x = 10;
    int x2 = 20; //
    // different name - safe
    //   // But if instance field named same as static, compile error not allowed in same class.
    // Note: Java does not allow an instance field and static field with same name in same class. This question shows best practice: avoid same names; will give compile error if duplicated.
    // Explanation: don't shadow in same class; compiler will reject duplicate field name.
}
