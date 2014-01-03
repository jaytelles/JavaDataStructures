/**
 * @(#)StackLinkList.java
 * @author Jay Telles
 * @version 1.00 2009/5/11
 */

class StackLinkList implements LinkListInterface
{
	/**
	 *@param temp is a temporary Doublenode for utility purposes
	 *@param fron is a DoubleNode to keep track of the DoubleNode at the end of the list
	 *@param back is a DoubleNode to keep track of the DoubleNode at the beginning of the list
	 *@param size keeps track of the number of nodes in the list
	 */
	
	private DoubleNode temp;
	private DoubleNode front;
	private DoubleNode back;
	private int size;
    
    /**
     *creates a new StackLinkList object
     *initializes temp, front, and back equal to null
     *initializes size to 0
     */
    public StackLinkList() 
    {
    	temp = front = back =  null;
    	size = 0;	
    }
    
    /**
     *The getmethod of the private attribute size
     *@return the number of nodes in the list
     */
    public int getSize()
    {
    	return size;
    }
    
    /**
     *adds a DoubleNode to the end of the list
     *@param p is the DoubleNode to be added
     */
    public void push(DoubleNode p)
    {
    	if(front == null)
    	{
    		front = back = temp = p;
    		size++;
    	}
    	
    	else
    	{
    		temp = p;
    		front.setNext(temp);
    		temp.setBack(front);
    		front = temp;
    		size++;
    	}
    	
    }
    
    /**
     *This method handles node removal
     *@return the node at the end of the list, null otherwise
     */
    public DoubleNode pop()
    {
    	if(front == null)
    	{
    		return null;
    	}
    
    	else
    	{
    		DoubleNode temp2 = front;
    		temp = front.getBack();
    		front = temp;
    		size--;
    		return temp2;
    	}
    }
    
    /**
     *checks if the list is empty
     *@return true if size equals 0 or back equals null
     */
    public boolean isEmpty()
    {
		return size == 0||back==null;
    }
    /**
     *sets front, back, and temp back to null, thus destroying the list
     *sets size to 0
     */
    public void clear()
    {
    	size=0;
    	front=back=temp=null;
    }
    
    /**
     *@return the last DoubleNode in the list without removing it
     */
    public DoubleNode peekTop()
    {
		return front;
    }
    
    /**
     *search for a vaue contained in the stack
     *@return the index of the first occurrence of the value, -1 if the value is not in the list
     */
    public int search(Object o)
    {
		temp = back;
		boolean flag = false;
		int index = 0;
		ListNode temp2 = new ListNode(o,null);
		
		if(back==null)
		{
			return -1;
		}
		
		while(temp.getNext()!=null&&flag==false)
		{
		    if(temp.getValue()==temp2.getValue())
		    {
				flag = true;
		    }
		    else
		    {
				index++;
				temp = temp.getNext();
		    }
		}
		
		if(flag)
		{
			return index;
		}
		else
		{
			return -1;
		}
	}
}

