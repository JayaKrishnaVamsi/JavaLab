package ext;
class thread extends Thread{
    thread(String name) {
       super(name);
    }
    public void run() {
                 System.out.println(this.getName()+" started:");
                 if(this.getPriority() == Thread.MAX_PRIORITY)
                 {
                               System.out.println(this.getName()+" entering sleep");
                               try
                               {
                            	   sleep(5000);
                               }
                               catch (InterruptedException e)
                               {          
                            	   e.printStackTrace();
                               }
                               System.out.println(this.getName()+" exiting sleep");
                 }
                 try
                 {
                	 for(int i=0;i<5;i++)
                	 {
                		 System.out.println(this.getName()+" "+i);
                		 Thread.sleep(1000);
                	 }
                 }
                 catch(Exception e) {
                               e.printStackTrace();
                 }
    }
}

public class a12 {
    public static void main(String args[]) {
                 Thread t = Thread.currentThread();
                 t.setName("My Main Thread");
                 System.out.println("Name changed to "+t.getName());
                 thread t1 = new thread("Thread 1");
                 thread t2 = new thread("Thread 2");
                 thread t3 = new thread("Thread 3");
                 thread t4 = new thread("Thread 4");
                 thread t5 = new thread("Thread 5");
                 t1.setPriority(Thread.MAX_PRIORITY);
                 t2.setPriority(Thread.MAX_PRIORITY);
                 t3.setPriority(4);
                 t4.setPriority(3);
                 t5.setPriority(2);
                 t1.start();
                 t2.start();
                 t3.start();
                 t4.start();
                 t5.start();
                 System.out.println("Thread 1 Alive?" +t1.isAlive());
                 System.out.println("Thread 2 Alive?" +t2.isAlive());
                  System.out.println("Thread 3 Alive?" +t3.isAlive());
                 System.out.println("Thread 4 Alive?" +t4.isAlive());
                 System.out.println("Thread 5 Alive?" +t5.isAlive());
                 try {
                               t1.join();
                               t2.join();
                               t3.join();
                               t4.join();
                               t5.join();
                 } catch (InterruptedException e1) {
                               // TODO Auto-generated catch block
                               e1.printStackTrace();
                 }
                 System.out.println("Thread 1 Alive?" +t1.isAlive());
                 System.out.println("Thread 2 Alive?" +t2.isAlive());
                 System.out.println("Thread 3 Alive?" +t3.isAlive());
                 System.out.println("Thread 4 Alive?" +t4.isAlive());
                 System.out.println("Thread 5 Alive?" +t5.isAlive());
                
    }

}

