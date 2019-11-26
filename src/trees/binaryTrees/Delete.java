package trees.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Delete {
    static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int i)
        {
            key=i;
            left=right=null;
        }
    }
    static Node root;
    static Node Temp;
    static Node Temp1;
    static Node del;
    public void Inorder(Node temp)
    {
        if(temp==null)
            return;
        Inorder(temp.left);
        if(temp.key!=-1)
            System.out.print(temp.key+", ");
        Inorder(temp.right);
    }
    public void delete(Node temp,int key)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(temp);
        while (!q.isEmpty())
        {
            Temp=q.peek();
            q.remove();
            if(Temp.key==key)
                del=Temp;
            if(Temp.left!=null)
            q.add(Temp.left);
            if(Temp.right!=null)
            q.add(Temp.right);
        }
        del.key=Temp.key;
//        del(root,Temp.key);
        Temp.key=-1;
    }

    public static void main(String[] args) {
        Delete k=new Delete();
        root=new Node(10);
        root.left=new Node(11);
        root.right=new Node(9);
        root.left.left=new Node(7);
        root.left.right=new Node(8);
        root.right.left=new Node(12);
        root.right.right=new Node(13);
        System.out.println("Before");
        k.Inorder(root);
        k.delete(root,9);
        System.out.println("After");
      k.Inorder(root);
    }
}
