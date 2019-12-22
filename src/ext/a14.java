package ext;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class a14 extends Applet implements MouseListener,MouseMotionListener{
int x1,x2,y1,y2;
	public a14()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		x2=e.getX();
		y2=e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x1=e.getX();
		y1=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
	public void paint(Graphics g) {
		int x=Math.min(x1,x2);
		int y=Math.min(y1, y2);
		int width=Math.max(x1, x2)-Math.min(x1, x2);
		int height=Math.max(y1, y2)-Math.min(y1, y2);
		g.drawRect(x, y, width, height);
	}
}
