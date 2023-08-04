package Polymorphism;

public class Childclass extends Parent {
	@Override//annotation for overriding
	public void display()
	{
		super.display();//using super class call parent class method
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childclass obj1 = new Childclass();
		obj1.display();
		
		//Parent obj2 = new Parent();
		//obj2.display();
		//super.display();//super is nonstatic and cannot call in main method.
	}

}
