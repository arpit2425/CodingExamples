package List;

public class StackImplementation {
    public static void main(String[] args) {
        StackInheritence<Integer> st=new StackInheritence<Integer>();
        st.push(42);
        st.print();
        st.push(87);
        st.print();
        st.push(77);
        st.print();
        try {
            int removed;
            while(!st.isEmpty())
            {
                removed=st.pop();
                System.out.println(removed);

            }
        }
        catch (EmptyListException e)
        {
            e.printStackTrace();
        }

    }
}
