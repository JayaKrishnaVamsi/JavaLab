package ext;

class stack implements datastructure{
int array[]=new int[10],stacktop=-1;
	public void push(int p) {
		if(isFull()) {
			System.out.println("stack full");
		}
		else {
			stacktop++;
			array[stacktop]=p;
		}
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("stack empty");
			return -1;
		}
		else {
			return array[stacktop--];
		}
		
	}

	public boolean isEmpty() {
		if(stacktop==-1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if(stacktop==10)
			return true;
		else
			return false;
	}

	

}
public class a1{
public static void main(String[] args) {
 stack s1=new stack();
 	s1.push(4);
 	s1.push(6);
 	System.out.println(s1.pop());
 	System.out.println(s1.pop());
 	System.out.println(s1.pop());
 	s1.push(9);
 	System.out.println(s1.pop());
}}