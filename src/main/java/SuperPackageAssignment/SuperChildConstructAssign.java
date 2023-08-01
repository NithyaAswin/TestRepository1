package SuperPackageAssignment;

public class SuperChildConstructAssign extends SuperParentConstructAssign{
	public SuperChildConstructAssign()
	{
		super();
	//	super(10,20,30);
		System.out.println("This is child constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildConstructAssign obj1 =new SuperChildConstructAssign();
	}

}
