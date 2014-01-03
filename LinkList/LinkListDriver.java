/**
 * @(#)LinkListDriver.java
 * @author Jay Telles
 * @version 1.00 2009/5/8
 */

public class LinkListDriver
{
    /**
     *This is a test method
     */
    public static void main(String[] args) 
    {
//      ListNodeTest();
      LinkListTestFirstMethods();
//      LinkListTestLastMethods();
// 		LinkListTestOtherMethods();
//		DoubleNodeTest();
//		StackLinkListTest();
//		QueueLinkListTest();
//		DoubleLinkListTestFirstMethods();
//		DoubleLinkListTestLastMethods();
//		DoubleLinkListTestOtherMethods();
    }
    
    public static void ListNodeTest()
    {
    	ListNode p = new ListNode(3,null);
        ListNode p2 = new ListNode(4,null);
        p.setNext(p2);
       
       	System.out.println((Integer)p.getValue());
       	p = p.getNext();
       	p.setValue(6);
       	System.out.println((Integer)p.getValue());
       	
       	System.out.println((Integer)p.getValue());
    }
    
    public static void LinkListTestFirstMethods()
    {
    	LinkList test = new LinkList();
    	ListNode a = new ListNode('a',null);
    	ListNode b = new ListNode('b',null);
    	ListNode c = new ListNode('c',null);
    	ListNode d = new ListNode('d',null);
    	
    	System.out.println("Testing the first methods");
    	System.out.println();
    	
    	System.out.println("testing with no nodes inserted");
    	System.out.println(test.peekFirst());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with just one node inserted");
    	test.insertFirst(a);
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("testing with two nodes inserted");
    	test.insertFirst(a);
    	test.insertFirst(b);
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());	
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());	
    	System.out.println();	
    		
    	System.out.println("testing with three nodes inserted");
    	test.insertFirst(a);
    	test.insertFirst(b);
    	test.insertFirst(c);
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
       	System.out.println(test.getSize());
       	System.out.println(test.removeFirst());
       	System.out.println(test.getSize());
       	System.out.println();

    	System.out.println("testing peekFirst method");
    	test.insertFirst(a);
    	test.insertFirst(b);
    	System.out.println(test.getSize());
    	System.out.println(test.peekFirst());
    	test.removeFirst();
    	System.out.println(test.getSize());
    	System.out.println(test.peekFirst());
    }
    
    public static void LinkListTestLastMethods()
    {
    	LinkList test = new LinkList();
    	ListNode a = new ListNode('a',null);
    	ListNode b = new ListNode('b',null);
    	ListNode c = new ListNode('c',null);
    	ListNode d = new ListNode('d',null);
    	
    	System.out.println("Testing the last methods");
    	System.out.println();
    	
    	System.out.println("Testing with no nodes inserted");
    	System.out.println(test.peekLast());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with one node inserted");
    	test.insertLast(a);
    	System.out.println(test.getSize());
    	System.out.println(test.removeLast());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("testing with two nodes inserted");
    	test.insertLast(a);
    	test.insertLast(b);
    	System.out.println(test.getSize());
   		System.out.println(test.peekLast());
    	System.out.println(test.removeLast());
    	System.out.println(test.peekLast());
    	System.out.println(test.getSize());
    	System.out.println(test.removeLast());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with three nodes inserted");
    	test.insertLast(a);
    	test.insertLast(b);
    	test.insertLast(c);
    	System.out.println(test.getSize());
    	System.out.println(test.removeLast());
    	System.out.println(test.getSize());
    	System.out.println(test.removeLast());
    	System.out.println(test.getSize());
    	System.out.println(test.removeLast());
    	System.out.println(test.getSize());
    }
    
    public static void LinkListTestOtherMethods()
    {	
    	System.out.println("Testing the LinkList other methods");
    	System.out.println();
    	LinkList test = new LinkList();
    	ListNode a = new ListNode('a',null);
    	ListNode b = new ListNode('b',null);
    	ListNode c = new ListNode('c',null);
    	ListNode d = new ListNode('d',null);
    	
    	test.insertLast(a);
    	test.insertLast(b);
    	test.insertLast(c);
    	test.insertLast(d);
    	
    	System.out.println("Testing if it IS contained");
    	int index = test.search(a.getValue());
    	if(index!=-1)
    	{
    		System.out.println("its contained");
    	}
    	
    	else
    	{
    		System.out.println("its not contained");
    	}
    	System.out.println();
    	
    	System.out.println("Testing if its NOT contained");
    	index = test.search('g');
    	if(index!=-1)
    	{
    		System.out.println("its contained");
    	}
    	
    	else
    	{
    		System.out.println("its not contained");
    	}
    	System.out.println();
    	
    	
    	test.clear();
    	System.out.println(test.peekFirst());
    	System.out.println(test.peekLast());
    	test.insertLast(a);
    	System.out.println(test.peekFirst().getValue());
    	test.removeFirst();
    	
    	
    	test.insertLast(a);
    	test.insertLast(b);
    	test.insertLast(c);
    	test.insertLast(d);		
		
	/*	System.out.println("testing the special insert");
		test.clear();
		System.out.println(test.getSize());
		test.insertLast(a);
		test.insertLast(b);
		test.insertLast(c);
		test.insertLast(d);
		test.insert(b,5);
		System.out.println(test.getSize());
		System.out.println(test.removeFirst());
		System.out.println(test.removeFirst());
		System.out.println(test.removeFirst());
		System.out.println(test.removeFirst());
		System.out.println(test.removeFirst());*/
    }
    
    public static void DoubleNodeTest()
    {
    	DoubleNode first = new DoubleNode(1,null,null);
    	DoubleNode second = new DoubleNode(2,null,null);
    	DoubleNode third = new DoubleNode(3,null,null);
    	
    	System.out.println(first);
    	
    	first.setNext(second);
    	second.setNext(third);
    	third.setBack(second);
    	second.setBack(first);
    	
    	System.out.print(first);
    	System.out.print(first.getNext());
    	System.out.println(first.getNext().getNext());
    	
    	System.out.print(third);
    	System.out.print(third.getBack());
    	System.out.println(third.getBack().getBack());
    	
    	first.setValue(8675309);
    	System.out.println(first);
    }
    
    public static void StackLinkListTest()
    {
    	StackLinkList test = new StackLinkList();
    	DoubleNode a = new DoubleNode('a',null,null);
    	DoubleNode b = new DoubleNode('b',null,null);
    	DoubleNode c = new DoubleNode('c',null,null);
    	DoubleNode d = new DoubleNode('d',null,null);
    	
    	System.out.println("Testing with no nodes inserted");
    	System.out.println(test.pop());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with one node inserted");
    	test.push(a);
    	System.out.println(test.pop().getValue());   
		System.out.println(test.getSize());
		System.out.println(); 
		
		System.out.println("Testing with two nodes inserted");
		test.push(a);     
		test.push(b);
		System.out.println(test.pop().getValue());
		System.out.println(test.pop().getValue());
		System.out.println(test.getSize()); 
		System.out.println();
		
		System.out.println("Testing with three nodes inserted");
		test.push(a); 
		test.push(b); 
		test.push(c);
		System.out.println(test.getSize());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop());
		System.out.println(test.getSize());
		System.out.println();
		
		System.out.println("Testing with four nodes inserted");
		test.push(a); 
		test.push(b); 
		test.push(c);
		test.push(d);
		System.out.println(test.getSize());
		System.out.println(test.peekTop());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.getSize());
		System.out.println();
		
		System.out.println("Testing isEmpty method");
		if(test.isEmpty())
		{
			System.out.println("Yay");
		}
		test.push(a);
		if(test.isEmpty())
		{
			System.out.println("yay");
		}
		else
		{
			System.out.println("awww");
		}
		System.out.println();
		
		System.out.println("Testing the search method");
		test.push(a);
		test.push(b);
		test.push(c);
		test.push(d);
		
		int x = test.search('g');
		if(x==-1)
		{
			System.out.println("not in list");
		}
		else
		{
			System.out.println("in list at index "+x);
		}    	
    	
    }
    
    public static void QueueLinkListTest()
    {
    	QueueLinkList test = new QueueLinkList();
    	DoubleNode a = new DoubleNode('a',null,null);
    	DoubleNode b = new DoubleNode('b',null,null);
    	DoubleNode c = new DoubleNode('c',null,null);
    	DoubleNode d = new DoubleNode('d',null,null);
    	
    	System.out.println("Testing with no nodes inserted");
    	System.out.println(test.pop());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with one node inserted");
    	test.push(a);
    	System.out.println(test.pop().getValue());   
		System.out.println(test.getSize());
		System.out.println(); 
		
		System.out.println("Testing with two nodes inserted");
		test.push(a);     
		test.push(b);
		System.out.println(test.pop().getValue());
		System.out.println(test.pop().getValue());
		System.out.println(test.getSize()); 
		System.out.println();
		
		System.out.println("Testing with three nodes inserted");
		test.push(a); 
		test.push(b); 
		test.push(c);
		System.out.println(test.getSize());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop());
		System.out.println(test.getSize());
		System.out.println();
		
		System.out.println("Testing with four nodes inserted");
		test.push(a); 
		test.push(b); 
		test.push(c);
		test.push(d);
		System.out.println(test.getSize());
		System.out.println(test.peekTop());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop().getValue());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.getSize());
		System.out.println();
    }
    
    public static void DoubleLinkListTestFirstMethods()
    {
    	DoubleLinkList test = new DoubleLinkList();
    	DoubleNode a = new DoubleNode('a',null,null);
    	DoubleNode b = new DoubleNode('b',null,null);
    	DoubleNode c = new DoubleNode('c',null,null);
    	DoubleNode d = new DoubleNode('d',null,null);
    	
    	System.out.println("Testing the DoubleList first methdods");
    	System.out.println();
    	
    	System.out.println("Testing with no nodes inserted");
    	System.out.println(test.peekFirst());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with one node inserted");
    	test.insertFirst(a);
    	System.out.println(test.peekFirst());
    	System.out.println(test.getSize());
    	test.removeFirst();
    	System.out.println(test.peekFirst());
    	System.out.println(test.getSize());
    	System.out.println();
    	
    	System.out.println("Testing with two nodes inserted");
    	test.insertFirst(a);
    	test.insertFirst(b);
    	System.out.println(test.peekFirst());
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
 		//extraneous removals do unwanted decrementation of test's size attribute
    	System.out.println();
    	
    	System.out.println("Testing with three nodes inserted");
    	test.insertFirst(a);
    	test.insertFirst(b);
    	test.insertFirst(c);
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println(test.removeFirst());
    	System.out.println(test.getSize());
    	System.out.println();
    }
    
    public static void DoubleLinkListTestLastMethods()
    {
    	DoubleLinkList test = new DoubleLinkList();
    	DoubleNode a = new DoubleNode('a',null,null);
    	DoubleNode b = new DoubleNode('b',null,null);
    	DoubleNode c = new DoubleNode('c',null,null);
    	DoubleNode d = new DoubleNode('d',null,null);
    	
   		System.out.println("Testing with no nodes inserted");
   		System.out.println(test.peekLast());
   		System.out.println(test.getSize());
   		System.out.println();
   		
   		System.out.println("Testing with one node inserted");
   		test.insertLast(a);
   		System.out.println(test.getSize());
   		System.out.println(test.removeLast());
   		System.out.println(test.getSize());
   		System.out.println();
   		
   		System.out.println("Testing with two nodes inserted");
   		test.insertLast(a);
   		test.insertLast(b);
   		System.out.println(test.getSize());
   		System.out.println(test.removeLast());
   		System.out.println(test.getSize());
   		System.out.println(test.removeLast());
   		System.out.println(test.getSize());
   		System.out.println();

		System.out.println("Testing with three nodes inserted");
		test.insertLast(a);
		test.insertLast(b);
		test.insertLast(c);
		
		System.out.println(test.getSize());
		System.out.println(test.removeLast());
		System.out.println(test.getSize());
		System.out.println(test.removeLast());
		System.out.println(test.getSize());
		System.out.println(test.removeLast());
		System.out.println(test.getSize());
   		
		
   			
   		
    }
    
    public static void DoubleLinkListTestOtherMethods()
    {
    	DoubleLinkList test = new DoubleLinkList();
    	DoubleNode a = new DoubleNode('a',null,null);
    	DoubleNode b = new DoubleNode('b',null,null);
    	DoubleNode c = new DoubleNode('c',null,null);
    	DoubleNode d = new DoubleNode('d',null,null);
    	
    	test.insertFirst(a);
    	test.insertFirst(b);
    	test.insertFirst(c);
    	test.insertFirst(d);
    	
		System.out.println(test.getSize());
		test.clear();
		System.out.println(test.getSize());
		
		test.insertFirst(a);
    	test.insertFirst(b);
    	test.insertFirst(c);
    	test.insertFirst(d);
		
		System.out.println("Testing if it IS contained");
    	int index = test.search(a.getValue());
    	if(index!=-1)
    	{
    		System.out.println("its contained");
    	}
    	
    	else
    	{
    		System.out.println("its not contained");
    	}
    	System.out.println();
    	
    	System.out.println("Testing if its NOT contained");
    	index = test.search('g');
    	if(index!=-1)
    	{
    		System.out.println("its contained");
    	}
    	
    	else
    	{
    		System.out.println("its not contained");
    	}
    	System.out.println();
    }
}



















