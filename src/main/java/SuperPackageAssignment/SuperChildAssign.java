package SuperPackageAssignment;


public class SuperChildAssign extends SuperParentAssign{

	public void display()
		{
			System.out.println("super child class2");
			System.out.println(super.a);
			super.print();//method
			super.print();//method
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				//System.out.println(super.s);//can refer only instance variable
				//cannot call static varaiable
				SuperChildAssign obj1 = new SuperChildAssign();
	            obj1.display();
		//obj1.print();
			}


}
