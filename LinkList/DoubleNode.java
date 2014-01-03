/**
 * @(#)DoubleNode.java
 * @author Jay Telles
 * @version 1.00 2009/5/11
 */
public class DoubleNode
{
	/**
	 *@param value is the value of the node
	 *@param forward is the pointer to the next node in the list
	 *@param previous is the pointer ot the previous node in the list
	 */
	private Object value;
	private DoubleNode forward;
	private DoubleNode previous;
	
	/**
	 *constructs a new DoubleNode object
	 *@param value is the value of the node
	 *@param forward is the pointer to the next node in the list
	 *@param previous is the pointer ot the previous node in the list
	 */
    public DoubleNode(Object val, DoubleNode thisNext, DoubleNode thisPrevious)//works 
    {
    	value = val;
    	forward = thisNext;
    	previous = thisPrevious;
    }
    
    /**
     *get method for the private previous attribute
     *@return the previous node in the list
     */
    public DoubleNode getBack()//works
    {
    	return previous;
    }
    
    /**
     *get method for the private next attribute
     *@return the next node in the list
     */
    public DoubleNode getNext()//works
    {
    	return forward;
    }
    
    /**
     *get method for the private value attribute
     *@return value
     */
    public Object getValue()//works
    {
    	return value;
    }
    
    /**
     *set method for the private forward attribute
     *@param p is the value to set forward to
     */
    public void setNext(DoubleNode p)//works
    {
    	forward = p;
    }
    
    /**
     *set method for the private previous attribute
     *@param p is the value to set previous to
     */
    public void setBack(DoubleNode p)//works
    {
    	previous = p;
    }
    
    /**
     *set method for the private value attribute
     *@param Object p is the value to set the value attribute to
     */
    public void setValue(Object p)//works
    {
    	value = p;
    }
    
    /**
     *returns a string representation of the node
     *@return the value attribute
     */
    public String toString()//works
    {
    	return String.valueOf(value);
    } 
}