/**
 * @(#)DoubleLinkList.java
 * @author Jay Telles
 * @version 1.00 2009/5/13
 */

public class DoubleLinkList implements LinkListInterface
{
	/**
	 *@param private temp is temporary DoubleNode for utility purposes
	 *@param front is the last node in the list
	 *@param back is the first node in the list
	 *@param size is the number of nodes in the list
	 */
	
	private DoubleNode temp;
	private DoubleNode front;
	private DoubleNode back;
	private int size;
	
	/**
	 *constructs a new DoubleLinkList object
	 *initializes temp, front, and back equal to null
	 *initializes size to 0
	 */
	
    public DoubleLinkList() 
    {
    	temp = front = back = null;
		size = 0;
    }
   
    /**
     *checks if the list is empty     
     * @return true if size equals 0 or back equals null
     */
     public boolean isEmpty()
     {
     	return size==0||back==null;
     }
    
    
    /**
     *get method of the size attribute
     *@return the number of nodes in the list
     */
    public int getSize()
    {
    	return size;
    }
    
    /**
     *inserts a node at the end of the list
     *@param p is the node to insert
     */
    
    public void insertLast(DoubleNode p)
    {
    	if(back==null)
    	{
    		back = temp = front = p;
    		size++;
    	}
    	else
    	{
    		temp = p;
  //  		front.setNext(temp);
    		temp.setBack(front);
    		front = temp;
    		size++;
    	}
    }
    
    /**
     *inserts the a DoubleNode at the first possible position in the list
     *@param p is the DoubleNode to insert
     */
    public void insertFirst(DoubleNode p)
    {
    	if(back==null)
    	{
    		back = temp = front = p;
    		size++;
    	}
    	else
    	{
    		p.setNext(back);
    		back.setBack(back);
    		size++;
    		back = p;
    	}
    }
    
    /**
     *get method for private DoubleNode back attribute
     *@return the DoubleNode at the first position in the list 
     */
    public DoubleNode peekFirst()
    {
    	return back;
    }
    
    /**
     *Get method for the private DoubleNode front attribute
     *@return the DoubleNode at the last position in the list
     */
    public DoubleNode peekLast()
    {
    	return front;
    }
    
    /**
     *Removes and returns the DoubleNode in the first position in the list
     *@return the DoubleNode in the first position in the list if in existence, null otherwise
     */
    public DoubleNode removeFirst()
    {
    	if(size>0)
    	{
    		size--;
    	}
    	
    	if(back==null)
    	{
    		return null;
    	}
    	else//watch extreaneous removals to decrement size!
    	{
    		temp = back;
    		back = back.getNext();
    	//	back.setBack(null);//code would set a null object's next pointer, throwing a NullPointerException
    		size--;
    		return temp;
    	}
    }
    
    /**
     *removes and returns the DoubleNode at the last position in the list
     *@return the DoubleNode at the end of the list if one exists, null otherwise
     */
    public DoubleNode removeLast()
    {
    	if(front==null)
    	{
    		return null;
    	}
    	else
    	{
    		temp=front;
    		front=front.getBack();
    		front.setNext(null);//code would set a null object's next pointer, throwing a NullPointerException
    		size--;
    		return temp;
    	}
    }
 
 	/**
 	 *search for a value in the list
 	 *@return the index of the value if contained, -1 otherwise
 	 *@param p is the value to search for
 	 */
    public int search(Object p)
    {
    	temp = new DoubleNode(p,null,null);
    	DoubleNode temp2 = back;
    	int index = 0;
    	boolean flag = false;
    	
    	if(back==null)
    	{
    		return -1;
    	}
    	
    	while(temp2.getNext()!=null&&!flag)
    	{
    		if(temp.getValue()==temp2.getValue())
    		{
    			flag = true;
    		}
    		else
    		{
    			index++;
    			temp2=temp2.getNext();
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
    
    /**
     *sets front, back, and temp back to null, thus destroying the list, and sets size to 0
     */
    public void clear()
    {
    	front = temp = back = null;
    	size = 0;
    }
}