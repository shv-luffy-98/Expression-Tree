package expressionTree;

class Node 
{
    String val;
    Node left, right;
    Node(String val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}