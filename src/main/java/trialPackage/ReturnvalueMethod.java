package trialPackage;

public class ReturnvalueMethod {

	public static String display()
	{
		String name = "Nithya";
		return name;
	}
	public static String display1(String name)
	{
		System.out.println(name);
		return name;
	}
	public static void main(String args[])
	{
		
		System.out.println(ReturnvalueMethod.display());
		ReturnvalueMethod.display1("Nithz");
		
	}
}
