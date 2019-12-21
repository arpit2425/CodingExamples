package List;

public class LinkNode <T> {
    T data;
    LinkNode <T> nextNode;

    public LinkNode(T data) {
                this(data,null);
    }
    public LinkNode(T object,LinkNode<T> next)
    {
        data=object;
        nextNode=next;
    }

    public T getData() {
        return data;
    }

    public LinkNode<T> getNextNode() {
        return nextNode;
    }
}
