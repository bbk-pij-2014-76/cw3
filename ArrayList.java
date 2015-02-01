public class ArrayList implements List
{
	private static int ARRAY_SIZE = 20;
	private int arraySize;
	public Object[] theArray;

	/**
	Constructor for the class ArrayList
	It creates an array called 'theArray' and its size is set to 20
	When an ArrayList will be created then the index of first object inserted will be 0
	*/

	public ArrayList ()
	{
		theArray  = new Object [ARRAY_SIZE];
		arraySize = 0;
	}


	public boolean isEmpty()
	{
	    if (arraySize == 0)
			return true;
		else
			return false;
	}
	public int size()
	{
		return arraySize;
	}

	public ReturnObject get(int index)
	{
		if ( isEmpty() )
			return new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);

		if ( index < 0 || index >= arraySize )
		{
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else
		{
			return new ReturnObjectImpl(theArray[index]);
		}
	}

	public ReturnObject remove(int index)
	{
		if ( theArray[index] == null )
		{
			return new ReturnObjectImpl (ErrorMessage.EMPTY_STRUCTURE);
		}
		if ( index < 0 || index >= arraySize )
		{
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		else
		{
			for ( int i=index ; i < arraySize ; i++ )
			{
				theArray[i] = theArray[i+1];
			}
			arraySize--;
			return new ReturnObjectImpl(theArray[index]);
		}

	}
	public ReturnObject add(int index, Object item)
	{
		if ( index < 0 || index >= arraySize )
		{
			return new ReturnObjectImpl (ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null )
		{
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else
		{
			for ( int i=arraySize ; i > index ; i-- )
			{
				theArray [i+1] = theArray [i];
			}
			theArray [index] = item;
			arraySize++;
			return new ReturnObjectImpl(theArray[index]);
		}
	}

	public ReturnObject add(Object item)
	{
		if ( item == null )
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		else
		{
			theArray[arraySize] = item;
			arraySize++;
			return new ReturnObjectImpl(theArray[arraySize]);
		}
	}

}