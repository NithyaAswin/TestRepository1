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
			
			finally //finally block is executed evenif exception is handled or not handled
			{
				System.out.println("this is finally block");
			}
		}
		
		public static void main(String[] args)
		{
			ExceptionHandlingSample  obj = new ExceptionHandlingSample();
			obj.display();
		}

}