package trees.binaryTrees;

public class Continuous {
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
    public boolean isContinous(Node root)
    {
        if(root==null)
            return true;
        else if(root.left==null&& root.right==null)
            return true;
        else if(root.right==null)
            return (Math.abs(root.key-root.left.key)==1)&&isContinous(root.left);
        else if(root.left==null)
            return (Math.abs(root.key-root.right.key)==1)&&isContinous(root.right);
        else
            return (Math.abs(root.key-root.right.key)==1)&&(Math.abs(root.key-root.left.key)==1)&&isContinous(root.left)&&isContinous(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(7);

        root.left     =new  Node(5);
        root.right     =new  Node(8);
        root.left.left = new Node(6);
        root.left.right = new Node(4);
        root.right.right = new Node(10);
        Continuous k=new Continuous();
        if(k.isContinous(root))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
