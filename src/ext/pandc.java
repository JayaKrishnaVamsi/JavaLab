package ext;
class QQ{
	int n;
	boolean valueset=false;
	synchronized void put(int n)
	{
		if(valueset)
		{
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Put :"+n);
		valueset=true;
		notify();
	}
	synchronized int get()
	{
		if(!valueset)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("got : "+n);
		valueset=false;
		notify();
		return n;
	}
}
class Producer implements Runnable{
	QQ q;
	Producer(QQ q)
	{
		this.q=q;
		new Thread(this,"p").start();
	}
	public void run() {
	int i=0;
		while(true)
			q.put(i++);
	}
}
class Consumer implements Runnable{
	QQ q;
	Consumer(QQ q)
	{
		this.q=q;
		new Thread(this,"c").start();
	}
	public void run() {
			while(true)
				q.get();
		}
}
public class pandc {
	public static void main(String[] args) {
		QQ q=new QQ();
		new Producer(q);
		new Consumer(q);

	}

}
