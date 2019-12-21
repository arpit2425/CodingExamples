package List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> li=new List<Integer>();
        li.InsertFront(10);
        li.print();
        li.InsertEnd(20);
        li.print();
        li.InsertFront(4);
        li.print();
        li.InsertFront(7);
        li.print();
        try {
            li.DeleteFront();
            li.print();
            li.DeleteFront();
            li.print();
            li.DeleteFront();
            li.print();
            li.DeleteFront();
            li.print();

        }
        catch (EmptyListException e)
        {
            e.printStackTrace();
        }

    }
}
