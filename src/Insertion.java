
public class Insertion { 

	Node head; 

	static class Node { 

		int data; 
		Node pointer; 

		Node(int d) 
		{ 
			data = d; 
			pointer = null; 
		} 
	} 

	public static Insertion insert(Insertion list, int data) 
	{ 

		Node new_node = new Node(data); 
		new_node.pointer = null; 

		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 

			Node last = list.head; 
			while (last.pointer != null) { 
				last = last.pointer; 
			} 

			last.pointer = new_node; 
		} 

		return list; 
	} 
 
	public static void printList(Insertion list) 
	{ 
		Node currNode = list.head; 

		System.out.print("[ "); 

		while (currNode != null) { 
			System.out.print(currNode.data + ", " ); 

			currNode = currNode.pointer; 
		} 
		System.out.print( "]" );
	} 

	public static void main(String[] args) 
	{ 
		Insertion list = new Insertion(); 

		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 

		printList(list); 
	} 
} 
