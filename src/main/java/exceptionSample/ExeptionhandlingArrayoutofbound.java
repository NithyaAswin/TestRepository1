package exceptionSample;

public class ExeptionhandlingArrayoutofbound {
	public void display()
	{
		int arr1[]=new int[5]; 
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2]= 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		try
		{
		for (int i=0;i <=5;i++)
		{
			System.out.println(arr1[i]);
		}
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeptionhandlingArrayoutofbound obj = new ExeptionhandlingArrayoutofbound();
obj.display();
	}

}
