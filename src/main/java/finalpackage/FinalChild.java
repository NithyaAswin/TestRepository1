package finalpackage;

public class FinalChild extends FinalParent {
	final int num=8;
	
	public void sub(int c,int d)
	{
		System.out.println(c-d);
		//num=10;//cannot change num value final keyword variable anywhere
	}
//public final void add(int a,int b)//if we use final in a method it cannot override in any other method
public void add(int a,int b)//
{
	System.out.println(a+b);
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalChild obj1 = new FinalChild();
		obj1.add(10,20);
		obj1.sub(30,20);
		
	}

}
