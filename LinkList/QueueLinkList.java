/**
 * @(#)QueueLinkList.java
 * @author Jay Telles
 * @version 1.00 2009/5/11
 */

class QueueLinkList
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
	 *constructs a new QueueLinkList object
	 *initializes temp, front, and back equal to null
	 *initializes size to 0
	 */
	public QueueLinkList()
	{
		temp = front = back = null;
		size = 0;
	}
	
	/**
     *sets front, back, and temp back to null, thus destroying the list, and sets size to 0
     */
	public void clear()
	{
		temp = back = front = null;
		size = 0;
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
     *@return the last DoubleNode in the list without removing it
     */
	public DoubleNode peekTop()
	{
		return back;
	}
	
	/**
     *checks if the list is empty
     *@return true if size equals 0 or back equals null
     */
	public boolean isEmpty()
	{
		return size==0||back==null;
	}
	
	/**
     *adds a DoubleNode to the end of the list
     *@param p is the DoubleNode to be added
     */
	public void push(DoubleNode p)
	{
		temp = p;
		if(back == null)
		{
			front = back = p;
			size++;
		}
		else
		{
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
		if(back == null)
		{
			return null;
		}
		
		else if(back.getNext()==null)
		{
			temp = back;
			size--;
			return temp;
		}
		
		else
		{
			temp = back;
			back = back.getNext();
			temp.setNext(null);
			size--;
			return temp;
		}
	}
	
	
	/**
 	 *search for a value in the queue
 	 *@return the index of the value if contained, -1 otherwise
 	 */
	public int search(Object p)
	{
		int index = 0;
		boolean flag = false;
		DoubleNode temp2 = new DoubleNode(p,null,null);
		temp = back;
		
		if(back==null)
		{
			return -1;
		}
		
		while(temp.getNext()!=null&&!flag)
		{
			if(temp.getValue()==temp2.getValue())
			{
				flag = true;
			}
			else
			{
				index++;
				temp = temp.getBack();
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








