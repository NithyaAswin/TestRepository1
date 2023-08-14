package exceptionSample;

public class SampleClass {
	
	public void test(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("Not Eligible");
		}else
		{
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj = new SampleClass();
		try {
			obj.test(15);
		}
		catch (LicenseException e) {
			e.printStackTrace();//printStackTrace used instead of printing statement
		}
	}

}
