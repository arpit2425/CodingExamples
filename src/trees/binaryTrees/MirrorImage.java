package trees.binaryTrees;

public class MirrorImage {
    Node root;
    static class Node
    {
        int data;
        Node left,right;
        Node(int i)
        {
            data=i;
            left=right=null;
        }

    }
    void mirror(Node node)
    {
        Node Temp;
        if(node==null)
            return;
        else
        {
            mirror(node.left);
            mirror(node.right);
            Temp=node.left;
            node.left=node.right;
            node.right=Temp;
        }
    }
    public void inorder(Node node)
    {
        if (node==null)
            return;
        else
        {
            inorder(node.left);
            System.out.print(node.data+ ", ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        MirrorImage i=new MirrorImage();
     i.root=new Node(1);
        i.root.left=new Node(2);
        i.root.right=new Node(3);
        i.root.left.left=new Node(4);
        i.root.left.right=new Node(5);
        i.root.right.left=new Node(6);
        i.root.right.right=new Node(7);
        i.inorder(i.root);
        i.mirror(i.root);
        System.out.println();
        i.inorder(i.root);
    }
}
