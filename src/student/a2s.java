package student;

public class a2s {
static String usn,deptname;
static int m1,m2,m3,sgpa;
public static void setdetails(String u,String d,int ma1,int ma2,int ma3,int s) {
	 usn=u;
	deptname=d;
	m1=ma1;
	m2=ma2;
	m3=ma3;
	sgpa=s;
}
public static void getdetails() {
	System.out.println("usn: "+usn);
	System.out.println("deptname: "+deptname);
	System.out.println("m1: "+m1);
	System.out.println("m2: "+m2);
	System.out.println("m3: "+m3);
	System.out.println("sgpa: "+sgpa);
}
}
