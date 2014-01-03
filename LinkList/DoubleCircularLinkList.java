/**
 * @(#)DoubleCircularLinkList.java
 * @author Jay Telles
 * @version 1.00 2009/5/17
 */

public class DoubleCircularLinkList implements LinkListInterface
{
	private DoubleNode front;
	private DoubleNode back;
	private DoubleNode temp;
	private int size;
	
    public DoubleCircularLinkList()
    {
    	front = back = temp = null;
    	size =	0;
    }
    
    public int getSize()
    {
    	return size;
    }
    
    public void clear()
    {
    	front = back = temp = null;
    	size = 0;
    }
    
    public boolean isEmpty()
    {
    	return size==0||back==null;
    }
    
    public int search()
    {
    	return 0;
    }
}