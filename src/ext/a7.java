package ext;

import java.util.Scanner;

class Record{
	Scanner sc=new Scanner(System.in);
	String name[]=new String[4];
	int rank[]=new int[4];
	int i=0;
	public Record() {
		for(int j=0;j<4;j++)
			rank[j]=0;
	}
	void readvalues() {
		for(int k=0;k<4;k++) {
		System.out.println("enter name");
		name[k]=sc.next();
		//sc.nextLine();
		System.out.println("enter rank");
		rank[k]=sc.nextInt();
	}}
	void display() {
		for(int j=0;j<4;j++) {
			System.out.println("name: "+name[j]+"    "+"rank: "+rank[j]);
		}
	}
}
class Rank extends Record{
	int index,min;
	public Rank() {
		super();
		index=0;
	}
	void display() {
		for(int j=0;j<4;j++)
			System.out.println("name: "+name[j]+"    "+"rank: "+rank[j]);
		System.out.println("toprank: "+min+"   "+"name: "+name[index]);
	}
	void highest() {
		//index=rank[0];
		min=rank[0];
		for(int j=1;j<4;j++)
		{
			if(rank[j]<min)
				{
				min=rank[j];
				index=j;
				}
			}
		System.out.println(index);
}}
public class a7 {
	public static void main(String[] args) {
		Rank r=new Rank();
		
		r.readvalues();
		r.highest();
		r.display();
	}

}
