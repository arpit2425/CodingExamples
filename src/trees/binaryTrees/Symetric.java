package trees.binaryTrees;

public class Symetric {
    static class Node
    {
        int key;
        Node left,right;
        Node(int i)
        {
            key=i;
            left=right=null;
        }
    }
    Node root;
    Node root1;
    public void mirror(Node node)
    {
        Node temp;
        if(node==null)
            return;
        else
        {
            mirror(node.left);
            mirror(node.right);
            temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
    }
    public boolean issymetric(Node a,Node b)
    {
        if(a==null&&b==null)
            return true;

        else if(a!=null&& b!=null && a.key==b.key)
            return (issymetric(a.left,b.right)&&issymetric(a.right,b.left));
        return false;
    }
public void inorder(Node node)
{
    if(node==null)
        return;
    else
    {
        inorder(node.left);
        System.out.print(node.key+" ,");
        inorder(node.right);
    }
}
    public static void main(String[] args) {
        Symetric tree=new Symetric();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        tree.root1=tree.root;
        tree.inorder(tree.root);
        System.out.println();
        tree.mirror(tree.root);
        tree.inorder(tree.root1);
        if(tree.issymetric(tree.root,tree.root1))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
