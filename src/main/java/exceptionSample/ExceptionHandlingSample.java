package exceptionSample;

public class ExceptionHandlingSample {

	public void display()
		{
			int a=10;
			try //arithmetic exception can be handled by try and catch
			{
			int b=a/0;
			System.out.println(b);
			}
			catch(Exception e) //inbuilt Exception
			{
				System.out.println(e);
			}
		}
		
		public static void main(String[] args)
		{
			ExceptionHandlingSample  obj = new ExceptionHandlingSample();
			obj.display();
		}

}