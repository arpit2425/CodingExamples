package trees.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Inorder {
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
    public void InodTrav(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        InodTrav(temp.left);
        System.out.print(temp.key+" ,");
        InodTrav(temp.right);
    }
    public void insert(Node temp,int key)
    {
        if(temp==null)
        {
            root=new Node(key);
        }
        else
        {
            Queue<Node> q=new LinkedList<>();
            q.add(temp);
            while (!q.isEmpty())
            {
                Temp=q.peek();
                q.remove();
                if(Temp.left==null)
                {
                    Temp.left=new Node(key);
                    return;
                }
                else {
                    q.add(Temp.left);
                }
                if (Temp.right==null)
                {
                    Temp.right=new Node(key);
                    return;
                }
                else
                {
                    q.add(Temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Inorder k=new Inorder();
       k.insert(root,10);
//
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        k.insert(root,12);
        System.out.println("Inorder traversal");
//        System.out.println(root.left.right.key);
        k.InodTrav(root);
    }
}
