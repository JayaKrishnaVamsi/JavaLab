package ext;

import java.util.Scanner;
class NameNotCorrectException extends Exception{
	public String toString(){
		return("name entered is invalid");
	}
}

class AgeLimitException extends Exception{
	public String toString(){
		return("age is greater than 50 exception");
	}
}
class employee{
	int age,sal;
	String ename;
	public employee(String n,int a,int s)
	{
		age=a;
		sal=s;
		ename=n;
	}
	void display() {
		System.out.println("ename: "+ename+"   age:  "+age+"   sal: "+sal);
	}
}

public class a3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age,salary;
	String name;
	System.out.println("enter name");
	name=sc.nextLine();
	System.out.println("enter age");
	age=sc.nextInt();
	System.out.println("enter salary");
	salary=sc.nextInt();
		try
		{
			if(age>50)
				throw new AgeLimitException();
		}
		catch (AgeLimitException e)
		{
			System.out.println(e);
			System.exit(0);
		}
		try
		{
			if( !((name != null) && (!name.equals("")) && (name.matches("^[a-zA-Z]*$"))) ) {
				throw new NameNotCorrectException();
			}
		}
		catch (NameNotCorrectException e)
		{
			System.out.println(e);
			System.exit(0);
		}
		employee e=new employee(name,age,salary);
		e.display();
		
	}

}
