package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public Employee(String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	
	

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Rash",32,"Kolkata");
		Employee e2 = new Employee("Rekha",27,"Mumbai");
		Employee e3 = new Employee("Mayank",34,"Bhopal");
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Iterator<Employee> it = ar.iterator();
		
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.city);
						
		}
		
		
		// TODO Auto-generated method stub

	}

}
