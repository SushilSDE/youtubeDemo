
public final class Student
{
	private final int id;
	private final String str;
	
	Student(int id, String str)
	{
		this.id=id;
		this.str=str;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", str=" + str + "]";
	}
}
