package ext;

import java.util.Scanner;

class library{
	int accnum,fine,i=0;
	String title,author;
	void input(int n,String t,String a) {
		accnum=n;
		title=t;
		author=a;
	}
	void compute(int days) {
		fine=days*2;
		System.out.println("Total fine = "+fine);
	}
	void display() {
		System.out.println("| AccesionNumber |   Title        |    Author   |");
		System.out.println("|       " + accnum + "        |      "+title+"     |      "+author+"   |");
		//System.out.println("title:  "+title);
		//System.out.println("author: "+author);
		
	}
}
public class a9 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	library l=new library();
	int accno;
	String title,author;
	l.input(1,"hello","vamsi");
	l.compute(4);
	l.display();
	library l2=new library();
	l2.input(2,"shello","s.vamsi");
	l2.compute(10);
	l2.display();
}
}
