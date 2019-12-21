package List;


public class List<T> {
    LinkNode <T> firstnode;
    LinkNode<T> lastnode;
    String name;
public List()
{
    this("List");
}
    public List(String name) {

        this.name = name;
        firstnode=lastnode=null;
    }
    public void InsertFront(T object)
    {
        if(isEmpty())
        {
            firstnode=lastnode=new LinkNode<T>(object);
        }
        else
        {
            firstnode=new LinkNode<T>(object,firstnode);
        }
    }
    public void InsertEnd(T object)
    {
        if(isEmpty())
        {
            firstnode=lastnode=new LinkNode<T>(object);
        }
        else
        {
            lastnode=lastnode.nextNode=new LinkNode<T>(object);
        }
    }
    public T DeleteFront()throws EmptyListException
    {
        if(isEmpty())
        {
            throw new EmptyListException(name);
        }
        T removed=firstnode.data;
         if(firstnode==lastnode)
         {
             firstnode=lastnode=null;
         }
         else
         {
             firstnode=firstnode.nextNode;
         }
         return removed;
    }
    public T DeleteEnd()throws EmptyListException
    {
        if(isEmpty())
        {
            throw new EmptyListException(name);
        }
        T removed=lastnode.data;
        if(lastnode==firstnode)
        {
            firstnode=lastnode=null;
        }
        else
        {
            LinkNode<T> current = firstnode;
            while(current.nextNode!=lastnode)
            {
                current=current.nextNode;
            }
            lastnode=current;
            current.nextNode=null;
        }
        return removed;
    }
public void print()
{
    if(isEmpty())
    {
        System.out.printf("The %s is Empty",name);
        return;
    }
    LinkNode<T> current=firstnode;
    System.out.printf("The %s is",name);
    while (current!=null)
    {
        System.out.printf("%s ",current.data);
        current=current.nextNode;
    }
    System.out.println();
}

    public boolean isEmpty() {

    return firstnode==null;
    }
}
