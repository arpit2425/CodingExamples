package List;

public class StackInheritence <T> extends List<T> {
    List<T> l=new List<T>();
    public StackInheritence()
    {
        super("Stack");
    }
    public void push(T object)
    {
        l.InsertFront(object);
    }
    public T pop()
    {
        return l.DeleteFront();
    }
    public void print()
}
