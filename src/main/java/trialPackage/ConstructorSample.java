package trialPackage;

public class ConstructorSample {
	public ConstructorSample()
	{
		System.out.println("This is a default constructor");
	}
public ConstructorSample(String s,int a,float f)
{
	System.out.println(s);
	System.out.println("integer"+a);
	System.out.println(f);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSample obj1 = new ConstructorSample();
		ConstructorSample obj2 = new ConstructorSample("Nithya",10,3.2f);
	}

}
