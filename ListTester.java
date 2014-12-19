public class ListTester
{
	public static void main ( String [] args )
	{
		LinkedList staff = new LinkedList();
		staff.name="Dick";
		staff.add (staff.name);
		staff.name="Harry";
		staff.add (staff.name);
		System.out.println ( staff.size());
	}
}