package expressionTree;
import java.util.Stack;

public class ExpressionTree
{
    private String infixExpression, postfixExpression;
    private Node tree;
    private Stack< Character > stack;
    
    public ExpressionTree()
    {
        infixExpression = new String("");
        postfixExpression = new String("");
    }
}