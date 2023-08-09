package exceptionSample;

public class ThrowException {
	public static void testThrow(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible for vote");//throw new Exceptionclassname("message")
		}
		else
		{
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rest of the code");
		ThrowException.testThrow(13);
		//System.out.println("Rest of the code");
	}

}
