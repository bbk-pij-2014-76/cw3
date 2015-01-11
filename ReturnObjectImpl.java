public class ReturnObjectImpl implements ReturnObject
{
	private Object returnObj;
	private ErrorMessage theMsg;

	public ReturnObjectImpl ( Object obj)
	{
		returnObj = obj;
		theMsg    = null;
	}

	public ReturnObjectImpl ( ErrorMessage message )
	{
		theMsg    = message;
		returnObj = null;
	}
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError()
	{
		if ( theMsg != null )
			return true;
		else
			return false;
	}

	/**
	 * Returns the error message.
	 *
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.

	 * @return the error message
	 */
	public ErrorMessage getError()
	{
		if (hasError() )
		{
			return theMsg;
		} else
			return ErrorMessage.NO_ERROR;
	}
	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been error.
	 *
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 *
	 * @return the return value from the method or null if there has been an
	 *         error
	 */
	public Object getReturnValue()
	{
		if ( !hasError() )
		{
			return returnObj;
		} else
		{
			return theMsg;
		}
	}
}