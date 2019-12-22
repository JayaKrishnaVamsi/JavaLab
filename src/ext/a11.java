package ext;

import java.util.Scanner;

public class a11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a string");
		String seq=sc.nextLine();
		seq=seq.toUpperCase();
		int count=0;
		for(int i=0;i<seq.length()-1;i++) {
			if(seq.charAt(i)==seq.charAt(i+1))
				count+=1;
		}
		System.out.println(count);

	}

}
