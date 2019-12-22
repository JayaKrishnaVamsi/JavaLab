package ext;
class Q{
	int n;
	boolean valueset=false;
	synchronized void put(int n)
	{
		if(valueset)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupt caught");
			}
		}
		this.n=n;
		System.out.println("Put: "+n);
		valueset=true;
		notify();
	}
	synchronized int get()
	{
		if(!valueset)
		{
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupt caught");
			}
		}
		System.out.println("Got: "+n);
		valueset=false;
		notify();
		return n;
	}
}

class Chef implements Runnable{
	Q q;
	Chef(Q q){
		this.q=q;
		new Thread(this,"chef").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
	
}

class Waitperson implements Runnable{
	Q q;
	Waitperson(Q q){
		this.q=q;
		new Thread(this,"waiter").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}

public class a8 {
	public static void main(String[] args) {
		Q q=new Q();
		new Chef(q);
		new Waitperson(q);
	}

}
