package ext;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class applet2 extends Applet implements KeyListener{
	TextField tf1,tf2,tf3;
		Label l1,l2,l3;
		public applet2() {
		
		l1=new Label("enter string");
		add(l1);
		tf1=new TextField(25);
		add(tf1);
		l2=new Label("enter P to check");
		add(l2);
		tf2=new TextField(25);
		add(tf2);
		tf2.addKeyListener(this);
		l3=new Label("result");
		add(l3);
		tf3=new TextField(25);
		add(tf3);
	}

	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='P') {
			tf3.setText("ok");
		String str=tf1.getText();
		int i=0,j=str.length()-1,flag=1;
		while(i<=j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else {
				flag=0;
				break;
			}
		}
		if(flag==1)
			tf3.setText("palindrome");
		else
			tf3.setText("not");
	}
		else tf3.setText("try again");	
	}
	public void keyReleased(KeyEvent e) {	
	}

	public void keyTyped(KeyEvent e) {
		
		
	}
}
