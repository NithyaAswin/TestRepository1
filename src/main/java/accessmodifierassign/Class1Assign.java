package accessmodifierassign;

public class Class1Assign {
private static String name = "Welcome to private";
public static void add()
{
	int c=11;
	int d=12;
	System.out.println(c+d);
}
int a=10;//default access modifier
static void sub()//default access modifier
{
	System.out.println("subtract");
}
protected static void print()
{
	System.out.println("Protected access modifier");
}
	public static void main(String args[])
	{
		Class1Assign.add();
	System.out.println(Class1Assign.name);
	//to call instance variable create object and call via print
	Class1Assign obj1 = new Class1Assign();
	System.out.println(obj1.a);
		
	Class1Assign.sub();
	}
}

