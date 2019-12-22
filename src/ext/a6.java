package ext;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception{
	public String toString(){
		return("age is greater than 25 exception");
	}
}
class LowCgpaException extends Exception{
	public String toString(){
		return("cgpa less than 8 exception");
	}
}


public class a6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter cgpa");
		int cgpa=sc.nextInt();
		try
		{
			if(age>25)
			{
				throw new AgeOutOfRangeException();
			}
			try
			{
				if(cgpa<8)
				{
					throw new LowCgpaException();
				}
			System.out.println("application accepted and under study");
			}
			catch(LowCgpaException e)
			{
				System.out.println(e);
			}
		}
		catch(AgeOutOfRangeException e) {
			System.out.println(e);
		}

	}

}