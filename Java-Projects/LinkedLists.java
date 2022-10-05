import java.util.*;

public class LinkedLists{
	
	public static void main(String[] args) 
	{
		
	LinkedList<String> linkedList = new LinkedList<String>();
	/* 
	linkedList.push("A");
	linkedList.push("B");
	linkedList.push("C");
	linkedList.push("D");
	linkedList.push("E");
	linkedList.pop();
	*/
	linkedList.offer("A");
	linkedList.offer("B");
	linkedList.offer("C");
	linkedList.offer("D");
	
	//linkedList.poll();

	linkedList.add(4, "E");
	linkedList.remove("E");
	System.out.println(linkedList.indexOf("D"));
	System.out.println(linkedList.peekLast());
	linkedList.addFirst("0");
	linkedList.addLast("1");
	String first =linkedList.removeFirst();
	String last =linkedList.removeLast();

	System.out.println(linkedList);

	}
}