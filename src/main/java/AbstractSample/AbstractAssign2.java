package AbstractSample;

public class AbstractAssign2 extends AbstractAssign1{
	public void abstractmethod()
	{
		System.out.println("This is abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractAssign2 obj=new AbstractAssign2();
		obj.abstractmethod();
		obj.display();
	}

}
