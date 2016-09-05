package practice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
//繪圖板
public class Drawer01 extends JPanel {
	public Drawer01() {
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(3));
		g2d.drawLine(0, 0, 100, 100);
		//畫線(~canvas)
		}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			int x = e.getX(), y = e.getY();
			super.mousePressed(e);
			System.out.println("Pressed:"+x+"x"+y);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseReleased(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Released:"+x+"x"+y);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Dragged:"+x+"x"+y);
		}
		
	}

}





