package accessmodifierassign;

public class Sample2 {

	public static void display2()
	{
		System.out.println("This is Sample2 class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2.display2();
		Sample1 obj2 = new Sample1();//aggregation calling another method using object from another class
		obj2.display3();//calling instance method from another class
	}

}
//to call instance method from another class Sample1 to Sample2 class -aggregation