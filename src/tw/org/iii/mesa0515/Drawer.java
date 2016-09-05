package tw.org.iii.mesa0515;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JPanel;

public class Drawer extends JPanel{
	
//	@Override
//	public void paint(Graphics g) {
//		super.paint(g);
//		System.out.println("0");
//	}
//	//少使用paint
	
	public Drawer(){
		//偵測滑鼠位置
		MyListener listener = new MyListener();
		addMouseListener(listener);
		//偵測滑鼠press, release, click
		addMouseMotionListener(listener);
		//偵測滑鼠移動事件
		
	}
	
	
@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("1");		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(0, 0, 100, 100);	
	}

	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Pressed: "+ x + "x" + y);
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseReleased(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Released: "+ x + "x" + y);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Dragged: "+ x + "x" + y);
		}
		
		
//	implements MouseListener //interface須包含五個方法

		

		
	}
	
}
