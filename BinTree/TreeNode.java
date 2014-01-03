/**
 * @(#)TreeNode.java
 *
 *
 * @Jay Telles 
 * @version 1.00 2009/5/6
 */
public class TreeNode 
{
	private TreeNode leftChild;
	private TreeNode rightChild;
	private int value;
	
    public TreeNode(int val, TreeNode lc, TreeNode rc) 
    {
    	value = val;
    	leftChild = lc;
    	rightChild = rc;
    } 
    	
    public boolean hasLeft()
    {
    	if(leftChild == null)
    		return false;
    	else
    		return true;
    }
    
    public boolean hasRight()
    {
    	if(rightChild == null)
    		return false;
    	else
    		return true;
    }
    
    public void setLeft(TreeNode p)
    {
    	leftChild = p;
    }
    
    public void setRight(TreeNode p)
    {
    	rightChild = p;
    }
    
    public void setValue(int x)
    {
    	value = x;
    }
    
    public TreeNode getRight()
    {
    	return rightChild;
    }
    
    public TreeNode getLeft()
    {
    	return leftChild;
    }
    
    public int getValue()
    {
    	return value;
    }
}