package Encapsulation;

public class Sample1 { //Hided class for encapsulation
	
	private String name;
	private int age;
	
	public void setter(String name,int age)//to set values
	{
		this.name=name;
		this.age=age;
		
	}

	public void getter()//to view /to get values
	{
		System.out.println(name);
		age=age*10;
		System.out.println(age);
	}
}
