public class ImprovedStackImpl implements ImprovedStack
{
	private Stack myStack;
	public ImprovedStackImpl (List myList)
	{
		myStack = new StackImpl (myList);
	}

	public ReturnObject pop()
	{
		return myStack.pop();
	}
	public ReturnObject top()
	{
		return myStack.top();
	}
	public boolean isEmpty()
	{
		return myStack.isEmpty();
	}
	public int size()
	{
		return myStack.size();
	}
	public void push(Object item)
	{
		 myStack.push(item);
	}
	public ImprovedStack reverse ()
	{
		int size = myStack.size();
		ImprovedStack newStack = new ImprovedStackImpl ( new LinkedList());
		for ( int i=0 ; i < size; i++)
		{
			newStack.push (myStack.pop());
		}
		return newStack;
	}

	public void remove ( Object item )
	{
		int size = myStack.size();
		ImprovedStack newStack = new ImprovedStackImpl ( new LinkedList());
		for (int i=0 ; i < size ; i++)
		{
			if (myStack.top().equals(item))
				myStack.pop();
			else
				newStack.push (myStack.pop());
		}
		myStack = new ImprovedStackImpl ( new LinkedList());
		size = myStack.size();
		for ( int i=0 ; i < size() ; i++ )
		{
			myStack.push(newStack.pop());
		}
	}
}