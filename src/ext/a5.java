package ext;
class display{
	synchronized void displayprime(int n,String msg)
	{
		System.out.println(msg);
		int flag,i,j;
		for(i=n;i<n+100;i++)
		{
			if(i==1)
				continue;
			flag=1;
			for(j=2;j<=i/2;++j)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
class caller implements Runnable{
	String msg;
	display target;
	int n;
	Thread t;
	public caller(display d,String s,int n)
	{
		this.msg=s;
		this.target=d;
		this.n=n;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		synchronized(target)
		{
			target.displayprime(n,msg);
		}
	}
}

public class a5 {
	public static void main(String[] args) {
		display d=new display();
		caller c1=new caller(d,"thread1",1);
		caller c2=new caller(d,"thread2",101);
		try {
			c1.t.join();
			c2.t.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
