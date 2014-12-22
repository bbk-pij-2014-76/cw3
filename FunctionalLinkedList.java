public class FunctionalLinkedList extends LinkedList implements FunctionalList
{
	public FunctionalLinkedList ()
	{
		super();
	}
	public ReturnObject head ()
	{
		if (theHead == null )
			return new ReturnObjectImpl ( ErrorMessage.EMPTY_STRUCTURE);
		else
			return new ReturnObjectImpl (theHead);
	}

	public FunctionalList rest ()
	{
		FunctionalLinkedList myList = new FunctionalLinkedList();
		if (theHead != null )
		{
		Node newNode = theHead;
		for ( int i=0 ; i<this.size()-1; i++)
		{
			myList.add(newNode.getNext());
			newNode = newNode.getNext();
		}
		}
		return myList;
	}
}