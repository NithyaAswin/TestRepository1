package exceptionSample;

public class ExceptionSample {//arithmetic exception
	public void display()
	{
		int a=10;
		int b=a/0;
		System.out.println(b);
	}
	
	public static void main(String args[])
	{ExceptionSample  obj = new ExceptionSample();
	//System.out.println("Before exception");
	obj.display();
	System.out.println("After exception");
	}

}
