package Encapsulation1;

import Encapsulation.Sample1;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Sample1 obj1 = new Sample1(); //aggregation-object of previous class is created in current class
 obj1.setter("Nithya", 30);//setter method is called
 obj1.getter(); //getter is called to get the values
	}

}
