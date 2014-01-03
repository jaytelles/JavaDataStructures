/**
 * @(#)BinaryTree.java
 * @author Jay Telles
 * @version 1.00 2009/5/6
 */

public class BinaryTree
{
	TreeNode p, temp, root;
	/**
	 *p is
	 *temp is
	 *root is
	 */
	
    public BinaryTree() 
    {
    	p = temp = root = null;
    } 
    
    public void insert(TreeNode x)
    {
    	p = x;
    	if(root==null)
    	{
    		root = temp = p;
    	}
    	
    	else if(p.getValue()>temp.getValue())
    	{
    		if(temp.hasRight()==true)
    		{
    			temp = temp.getRight();//problem with the way that temp is reset?
    			insert(p);
    		}
    		else
    		{
    			temp.setRight(p);
    			temp = root;
    		}
    	}
    	
    	else if(p.getValue()<temp.getValue())
    	{
    		if(temp.hasLeft()==true)
    		{
    			temp = temp.getLeft();
    			insert(p);
    		}
    		else
    		{
    			temp.setLeft(p);
    			temp = root;
    		}
    	}    
    }
    
    public void traverseInOrder(TreeNode p)
    {
    	traverseInOrder(p.getLeft());
    	System.out.print(p.getValue() + ", ");
    	traverseInOrder(p.getRight());
    }
    
    public void traversePostOrder(TreeNode p)
    {	
		traversePostOrder(p.getLeft());
		traversePostOrder(p.getRight());
		System.out.println(p.getValue());
    }

    public void traversePreOrder(TreeNode p)
    {
    	System.out.println(p.getValue());
		traversePreOrder(p.getLeft());
		traversePreOrder(p.getRight());
    }

    public TreeNode search(TreeNode x)
    {
    	p = x;
    	
		if(p!=null)//problem with variable tested
		{
			if(p.getValue()>temp.getValue())
			{
				if(temp.getRight()!=null)
				{
					temp = temp.getRight();
					search(p);
				}
			}
			
			else if(p.getValue()<temp.getValue())
			{
				if(temp.getLeft()!=null)
				{
					temp = temp.getLeft();
					search(p);
				}
				else
				{
					temp = root;
					return null;
				}
			}
			
			else if(p.getValue()==temp.getValue())
			{
				return temp;
			}
			
			else
			{
				temp = root;
				return null;
			}	
		}
		return null;
	}
}