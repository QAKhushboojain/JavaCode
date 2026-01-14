package Constructor;
// Constructor chaining across classes using super(this-style)
public class BB extends AA{
    BB()
    {
        this(3);
        System.out.println("BB()");
    }
    BB(int x)
    {
        super(x);
        System.out.println("BB(int");
    }

    public static void main(String[] args) {
        new BB();
        // Explanation: this(3) calls BB(int) which calls super(3) first, then prints.
    }
}
