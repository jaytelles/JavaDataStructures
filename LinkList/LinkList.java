/**
 * @(#)LinkList.java
 * This class is a single Linked List
 * @author Jay Telles
 * @version 1.00 2009/5/18
 */
import java.io.*;

public class LinkList implements LinkListInterface
{
	private ListNode front;
	private ListNode back;
	private ListNode temp;
    private int size;
   
    public LinkList() 
    {
    	front = temp = back = null;
    	size = 0;
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
    
    public int search(Object p)
    {	
    	int index = 0;
    	boolean flag = false;
    	temp = back;
    	ListNode temp2 = new ListNode(p,null);
    	
    	if(back==null)
    	{
    		return -1;
    	}
    	//else if case
    
    	else
    	{
    		while(temp.getNext()!=null&&flag==false)
    		{
    			if(temp.getValue()==temp2.getValue())
    			{
    				flag = true;	
    			}
    			else
    			{
    				temp = temp.getNext();
    				index++;
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
    
   	public void insertFirst(ListNode x)
   	{
   		if(back==null)
   		{
   			front = back = temp = x;
   			size++;
   		}
   		else
   		{
   			x.setNext(back);
   			back = x;
   			size++;
   		}
   	}
   	
   	public ListNode peekFirst()
   	{
   		return back;
   	}
   	
   	public ListNode removeFirst()
   	{
   		
   		if(back == null)
   		{
   			return null;
   		}
   		
   		else
   		{
   			temp = back;
   			back = back.getNext();
   			size--;
   			return temp;
   		}   	
   	}
   	
   	public void insertLast(ListNode x)
   	{
   		if(front==null)
   		{
   			front = back = x;
   			size++;
   		}
   		else
   		{
   			front.setNext(x);
   			front = x;
   			size++;
   		}	
   	}
   	
   	public ListNode peekLast()
   	{
   		return front;
   	}
   	
   	public ListNode removeLast()
   	{
   		if(front==null)
   		{
   			return null;
   		}
   		else
   		{
   			ListNode temp2 = back;
   			while(temp2.getNext()!=front&&temp2.getNext()!=null)//second condition test
   			{
   				temp2 = temp2.getNext();
   			}
   			temp = front;
   			front = temp2;
   			size--;
   			return temp;
   		}
   	}   	
}