package InheritancePolymorphism;

public class P2 {
    int id;


    P2(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof P2)) return false;
        P2 other = (P2) o;
        return this.id == other.id;
    }
}
