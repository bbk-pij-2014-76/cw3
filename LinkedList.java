public class LinkedList implements List
{
	public Node theHead; 		// reference to the head node.

	public LinkedList()
	{
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		theHead    = null;
	}

	public boolean isEmpty ()
	{
		if (theHead == null)
			return true;
		else
			return false;
	}
	public int countNodes ( Node node )
	{
		if ( node != null )
			return 1 + countNodes (node.getNext());
		else
			return 0;
	}
	public int size()
	{
		return countNodes(theHead);
	}

	public ReturnObject get(int index)
	{
		if (index < 0 || index >= size() )
			return new ReturnObjectImpl ( ErrorMessage.INDEX_OUT_OF_BOUNDS);
		else {
			Node theNode = theHead;
			for ( int i = 0; i < index ; i++)
				theNode = theNode.getNext();
				return  new ReturnObjectImpl (theNode.getData());
		}
	}

	public ReturnObject remove(int index)
	{
		return new ReturnObjectImpl ( ErrorMessage.INDEX_OUT_OF_BOUNDS);
	}
	public ReturnObject add(Object item)
	{
		return add (item);
	}
	public ReturnObject add(int index, Object item) {
		if ( item != null )
		{
			if ( index < 0 || index > size() )
				return new ReturnObjectImpl ( ErrorMessage.INDEX_OUT_OF_BOUNDS);
			else
			{
				if ( theHead == null && index == 0)
				{	NodeImpl newNode = new NodeImpl(item);
							theHead  = newNode;
				}
			}

		}
		return new ReturnObjectImpl (theHead);
	}
}