import java.util.*;
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
    }
}
class Binarytree{
    Node root;
    void printlevelorder()
    {
        Queue<Node> q1=new LinkedList<Node>();
        q1.add(root);
        while (!q1.isEmpty())
        {
            Node tempNode = q1.poll();
            System.out.print(tempNode.key + " ");
            if (tempNode.left != null)
            {
                q1.add(tempNode.left);
            }
            if (tempNode.right != null)
            {
                q1.add(tempNode.right);
            }
        }
    }
}
public class Dfs {
    public static void main(String args[])
    {

        Binarytree tree = new Binarytree();
        tree.root = new Node(10);
        tree.root.left = new Node(25);
        tree.root.right = new Node(33);
        tree.root.left.left = new Node(41);
        tree.root.left.right = new Node(54);

        tree.printlevelorder();
    }
}
