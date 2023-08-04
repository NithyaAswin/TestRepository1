package accessmodifierassign;

public class ParentStudent {

	public void student(String name,char ch)
	{
		System.out.println(name);
		System.out.println(ch);
		System.out.println("This is instance method of student details");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ParentStudent obj1 = new ParentStudent();
		System.out.println();
				
	}

}
