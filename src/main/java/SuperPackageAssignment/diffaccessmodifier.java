package SuperPackageAssignment;


public class diffaccessmodifier {

	protected static void multiply()
	{
		int x=10;
		int y=20;
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply();
	//	Class2Protectedaccessmod.display();//cannot access protected form diff package of class
	}

}
