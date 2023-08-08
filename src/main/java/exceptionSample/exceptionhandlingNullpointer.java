package exceptionSample;

public class exceptionhandlingNullpointer {

	public void display()
	{
		try 
		{
		String s = null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args)
	{
		exceptionhandlingNullpointer  obj = new exceptionhandlingNullpointer();
		obj.display();
	}


	}

