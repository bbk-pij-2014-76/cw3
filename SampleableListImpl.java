public class SampleableListImpl implements SampleableList
{
	private List myList;
	public SampleableListImpl(List list)
	{
		myList = list;
	}
	public ReturnObject add (int index , Object item)
	{
		return myList.add(index,item);
	}
	public ReturnObject add (Object item)
	{
		return myList.add(item);
	}
	public ReturnObject remove (int index)
	{
		return myList.remove(index);
	}
	public ReturnObject get (int index)
	{
		return myList.get(index);
	}
	public int size ()
	{
		return myList.size();
	}
	public boolean isEmpty ()
	{
		return myList.isEmpty();
	}

	public SampleableList sample ()
	{
		SampleableList sampleList = new SampleableListImpl ( new LinkedList() );
		for ( int i=0 ; i<myList.size(); i++)
		{
			if (i%2 != 0)
			{
				sampleList.add(myList.get(i));
			}
		}
		return sampleList;

	}
}