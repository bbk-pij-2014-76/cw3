public class StackImpl extends AbstractStack
{
	public StackImpl ( List myList)
	{
		super (myList);
	}
	public boolean isEmpty ()
	{
		if (internalList.size() == 0 )
			return true;
		else
			return false;
	}
	public int size ()
	{
		return internalList.size();
	}
	public void push ( Object item)
	{
		internalList.add(item);
	}
	public ReturnObject top ()
	{
		if (!isEmpty())
			return internalList.get(size()-1);
		else
			return new ReturnObjectImpl ( ErrorMessage.EMPTY_STRUCTURE);
	}
	public ReturnObject pop ()
		{
			if (!isEmpty())
				return internalList.remove(size()-1);
			else
				return new ReturnObjectImpl ( ErrorMessage.EMPTY_STRUCTURE);
	}
}