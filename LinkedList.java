public class LinkedList implements List
{
	public class Node
	{
		private int index;
		private Object item;
		private Node next;
		public Node (int index, Object item)
		{
			this.index = index;
			this.item  = item;
				  next = null;
		}
		public Object getItem()
		{
			return item;
		}
		public void setItem ( Object item)
		{
			this.item = item;
		}
		public void add ( Node node)
		{
			if (next == null)
				next = node;
			else
				next.add(node);
		}
		public void add ( int index, Node node)
		{
			if (next.index == index)
			{
				 Node temp = next;
				      next = node;
				  node.next= temp;
		    node.next.index= this.index+1;
			}
			else
				next.add(index,node);
		}
		public Node getNode( int index)
		{
			if (next.index == index)
				return next;
			else
				return next.getNode(index);
		}
		public Node remove ( int index)
		{
			if (next.index == index)
			{
				 Node temp = next;
				 if (next.next != null)
				 {
						  next=next.next;
			        next.index= this.index-1;
				 } else
				 {
					next = null;
				 }
				 	return temp;
			}
			else
				return next.remove(index);
		}
	}

	private Node theHead;
	private int indexValue;
	public LinkedList ()
	{
		theHead = new Node (-1,null);
	 indexValue = 0;
	}

	public ReturnObject add(Object item)
	{
		if (item == null)
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		else
		{
			Node newNode = new Node (indexValue, item);
			indexValue++;
			theHead.add(newNode);
			return null;
		}
	}
	public ReturnObject add(int index, Object item)
	{
		if (item == null)
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		else
		{
			if ( index < 0 || index >= size())
				return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			else
			{
			Node newNode = new Node (index, item);
			indexValue++;
			theHead.add(newNode);
			return null;
			}
		}
	}
	public ReturnObject get(int index)
	{
		if (isEmpty() )
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		if ((index < 0) || (index >= size()))
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		else
			return new ReturnObjectImpl(theHead.getNode(index).getItem());
	}
	public ReturnObject remove (int index)
	{
		if (isEmpty() )
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		if ((index < 0) || (index >= size()))
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		else
		{
			indexValue--;
			return new ReturnObjectImpl(theHead.remove(index).getItem());
		}
	}
	public int size()
	{
		return indexValue;
	}
	public boolean isEmpty()
	{
		if ( indexValue == 0)
			return true;
		else
			return false;
	}
}
