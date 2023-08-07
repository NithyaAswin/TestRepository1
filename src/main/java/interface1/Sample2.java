package interface1;

public class Sample2 implements Sample{
	public void display()
	{
		System.out.println("This is a dispaly statement");
	}
public void add()
{
	System.out.println(a+b);
}
public static void print()
{
	System.out.println("Method in Class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sample2 obj1 = new Sample2();
		 Sample obj2=new Sample2();//interface has no constructor so object created with class name instaed of 
		 
		// obj1.display();
		// obj1.add();
		// obj1.print();
		// System.out.println(obj1.b);
		 
		   obj2.display();
			 obj2.add();
			//obj2.print();it is a method of class
			System.out.println(obj2.b);
	}

}
