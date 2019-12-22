package ext;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class a4 extends Applet implements KeyListener{
TextField tf1,tf2,tf3;
Label l1,l2,l3;
public a4()
{
l1=new Label("enter the string");
add(l1);
tf1=new TextField(20);
add(tf1);
l2=new Label("enter P for to find palindrome");
add(l2);
tf2=new TextField(20); 
add(tf2);
tf2.addKeyListener(this);
l3=new Label("result is");
add(l3);
tf3=new TextField(15); 
add(tf3);
}
public void keyPressed(KeyEvent arg0) {
}
public void keyReleased(KeyEvent arg0) {
}
public void keyTyped(KeyEvent e) {
	if(e.getKeyChar()=='P')
	{
		String s=tf1.getText();
		System.out.println(s.length());
		int flag=0;
		int i=0;
		int j=s.length()-1;
		
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=1;
				break;
			}
			else
			{
				i=i+1;
				j=j-1; 
			}
		}
		if(flag==1)
		{
			tf3.setText("no");
		}
		else
		{
			tf3.setText("yes");
		}
	}
	else
	{
		tf3.setText("try again");
	}
	}
	}
