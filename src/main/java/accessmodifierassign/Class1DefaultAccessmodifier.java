package accessmodifierassign;

public class Class1DefaultAccessmodifier {
int a=12;
static void defaultaccess()//default access modifier-default keyword not specified
{
	System.out.println("This is default access modifier");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1DefaultAccessmodifier obj1 = new Class1DefaultAccessmodifier();
		System.out.println(obj1.a);
		Class1DefaultAccessmodifier.defaultaccess();
	}

}
