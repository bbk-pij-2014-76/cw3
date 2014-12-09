public class ReturnObjectImpl implements ReturnObject {
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError()
	{
		return false;
	}

	/**
	 * Returns the error message.
	 *
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 *
	 * @return the error message
	 */
	public ErrorMessage getError()
	{
		if (!hasError()) {
			System.out.println (" NO_ERROR");
			return null;
		} else
		System.out.println ( " There has been an Error");
			return null;
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
		if ( !hasError() ) {
			System.out.println ( " There has been an Error");

		}
		return null;
	}
}