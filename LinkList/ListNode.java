/**
 * @(#)ListNode.java
 * @author Jay Telles
 * @version 1.00 2009/5/8
 *This class is the basis for the LinkList class.
 *A single object stores both a vlaue and a pointer to the next node in the list
 */
import java.io.*;//necessary for making some files specific
 
public class ListNode 
{
    /**
     *@param value attribute stores the node's value
     *@param next attribute stores the pointer to the next node
    */
    private Object value;
    private ListNode next;
    
    
    /**
     *constructs a new ListNode object
     *initializes value to first parameter
     *initializes next to the second parameter
     */
    public ListNode(Object val, ListNode x) 
    {
    	value = val;
    	next = x;
    }
    
    /**
     *getNext gets the next node in the list
     *@return the next node in the list, if it exists. Otherwise returns null
     */
    public ListNode getNext()
    {
    	return next;
    } 
    
    /**
     *setNext sets the pointer of the node to the paramter passed in
    */
    public void setNext(ListNode p)//tested
    {
    	next = p;
    }
    
    /**
     *getValue returns the value stored by the value attribute
     */
    public Object getValue()
    {
    	return value;
    }
    
    /**
     *setValue sets the value of the value attribute to the parameter passed in
     */
    public Object setValue(Object x)//something wrong, value not being reset
    {
    	return value;
    }
    
    /**
     *returns a string representation of the node
     *@return the value attribute
     */
    public String toString()
    {
    	return String.valueOf(value);
    }	  
}