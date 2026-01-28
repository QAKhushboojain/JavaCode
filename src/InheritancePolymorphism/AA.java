package InheritancePolymorphism;

public class AA
{
    int id;
    AA(int id)
    {
        this.id=id;
    }
    public boolean equals(Object o)
    {
        return o instanceof A && this.id==((AA)o).id;
    }
}


