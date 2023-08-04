package accessmodifierassign;

public class Class2Assign extends Class1Assign {
	public static void subtract()
	{
		int c=22;
		int d=10;
		System.out.println(c-d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2Assign.subtract();
		Class1Assign.add();
		Class1Assign.sub();
		
		Class1Assign.print();
		
	}

}
