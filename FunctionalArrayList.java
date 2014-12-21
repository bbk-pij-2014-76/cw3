public class FunctionalArrayList extends ArrayList implements FunctionalList
{
	public FunctionalArrayList()
	{
		super();
	}

	public ReturnObject head ()
	{
		if (theArray[0] == null)
			return new ReturnObjectImpl ( ErrorMessage.EMPTY_STRUCTURE);
		else
			return new ReturnObjectImpl ( theArray[0]);
	}

	public FunctionalList rest()
	{
		FunctionalArrayList myArray = new FunctionalArrayList();
		for ( int i=0 ; i< theArray.length ; i++)
		{
			if (theArray[i] != null)
			{
				myArray.add (theArray[i]);
			}
		}
		return myArray;
	}
}