package advmat;

public class pyt {
	public void printpyth(int m) {
		int a=4*m*m;
		int b=(m*m-1)*(m*m-1);
		int c=(m*m+1)*(m*m+1);
		int d=a*a+b*b;
		if(d==c*c) {
			System.out.println("pythagorean triplets are:"+a+","+b+","+c);
		}
		else
			System.out.println("no triplets");
	}
}
