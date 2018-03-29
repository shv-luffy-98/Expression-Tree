package expressionTree;
import java.util.Stack;

public class ExpressionTree
{
    private String infixExpression, postfixExpression;
    private Node tree;
    private Stack< String > stack;
    private double variableArray[];

    //get functions
    public String getPostfix(){ return postfixExpression; }
    public Node getTree() { return tree; }

    //Constructor
    public ExpressionTree()
    {
        infixExpression = new String("");
        postfixExpression = new String("");
    }

////////////////////////////////////////////////////////////////////////////////////////
    //set functions
    public boolean setInfixExpression (String a)
    {
        infixExpression = a; 
        postfixExpression = "";
        tree = null;
    }

    public boolean setVariablesArray (int arr[])
    {
        try
        {
            for(int i = 0; i < 26; ++i)
                variableArray[i] = arr[i];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println();
            System.out.println("Expressiontree::setVariablesArray::ArrayOutOfBounds");
            return false;
        }
        return true;   
    }
    public boolean setVariablesArray (float arr[])
    {
        try
        {
            for(int i = 0; i < 26; ++i)
                variableArray[i] = arr[i];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println();
            System.out.println("Expressiontree::setVariablesArray::ArrayOutOfBounds");
            return false;
        }
        return true;   
    }
    public boolean setVariablesArray (double arr[])
    {
        try
        {
            for(int i = 0; i < 26; ++i)
                variableArray[i] = arr[i];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println();
            System.out.println("Expressiontree::setVariablesArray::ArrayOutOfBounds");
            return false;
        }
        return true;   
    }

////////////////////////////////////////////////////////////////////////////////////////
    //Evaluation functions
    public boolean infixToPostfix()
    {
        return true;
    }
    public void createExpressionTree()
    {
        ;
    }
    public boolean createExpressionTree(String a)
    {
        return true;
    }
    public double Evaluate()
    {
        return 0.0;
    }
    private double EvaluateHelper(Node node)
    {
        return 0.0;
    }
    
////////////////////////////////////////////////////////////////////////////////////////
    //helper functions
    private boolean operatorCheck(char c)
    {
    	switch (c)
        {
    		case '+':
    		case '-':
    		case '*':
    		case '/':
            case '^':
            	return true;
            default:
                return false;
        }
    }
    private int precedence(char c)
    {
        switch (c)
        {
            case '+':
            case '-':
                return 1;
      
            case '*':
            case '/':
                return 2;
 
            case '^':
                return 3;

            default:
                return 0;
        }
    }
}