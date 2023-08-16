package trialPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> l1 = new ArrayList();

l1.add(10);
l1.add(20);
l1.add(30);
System.out.println(l1);
List <Integer> l2 = new ArrayList();
l2.add(100);
l2.add(200);
l2.add(300);
l2.add(400);
l2.add(500);
System.out.println(l2);

//addAll method
l2.addAll(l1);
System.out.println(l2);

//removeall method
System.out.println(l1);
l1.removeAll(l1);
System.out.println(l1);

//get method
l2.get(0);
System.out.println(l2.get(0));
//size method-total no of elements
l2.size();
System.out.println(l2);
System.out.println(l2.size());

//contains method
boolean b1= l2.contains(100);
System.out.println(b1);

//Iterator

Iterator itr = l2.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
itr.remove();//removes elements one by one from 0th index.
	System.out.println(l2);
}

	}
}
