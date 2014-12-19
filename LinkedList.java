public class LinkedList implements List
{
	private Node head; 		// reference to the head node.
	private int listCount; 	// just for speed

	public LinkedList()
	{
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = new NodeImpl(null);
		listCount = 0;
	}

	public boolean isEmpty ()
	{
			if (this.isEmpty())
				return true;
			else
				return false;
	}
	public int size()
	{

   		return size();
	}

	public ReturnObject get(int index)
	{
		return get(index);
	}

	public ReturnObject remove(int index)
	{
		return remove(index);
	}
	public ReturnObject add(int index, Object item)
	{
		return add (index,item);
	}
	public ReturnObject add(int listCount, Object data) {
		Node temp = new NodeImpl(data);
		Node current = head;
		// starting at the head node, crawl to the end of the list
		while (current.getNext() != null) {
			current = current.getNext();
		}
		// the last node's "next" reference set to our new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
		return current;
	}
}