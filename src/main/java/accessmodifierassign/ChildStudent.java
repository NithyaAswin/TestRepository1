package accessmodifierassign;

public class ChildStudent extends ParentStudent{
	public void student(String name,char ch)
	{
		super.student("Divya",'B');
		//System.out.println("This is instance method child of student details");
		System.out.println(name);
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildStudent obj2 = new ChildStudent();
		obj2.student("Nithya",'A');
		}
}
