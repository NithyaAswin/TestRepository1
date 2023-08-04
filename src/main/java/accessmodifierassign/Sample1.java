package accessmodifierassign;

public class Sample1 {
	
	public static void display()
	{
		System.out.println("This is sample method");
	}
	public void display3()
	{
		System.out.println("This is instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1.display();
		
		Sample1 obj1 = new Sample1();
		obj1.display3();
				
	}

}
