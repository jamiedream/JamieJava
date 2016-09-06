package tw.org.iii.mesa0515;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Drawer extends JPanel{
	
//	@Override
//	public void paint(Graphics g) {
//		super.paint(g);
//		System.out.println("0");
//	}
//	//少使用paint
	
//	private LinkedList<HashMap<String, Integer>> line;
	//一條linkedLIST構成的線上hashmap為線上點
	
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycle;
	//多條線
	public Drawer(){
		//偵測滑鼠位置
		MyListener listener = new MyListener();
		addMouseListener(listener);
		//偵測滑鼠press, release, click
		addMouseMotionListener(listener);
		//偵測滑鼠移動事件
		lines = new LinkedList<>();//線在drawer定義
		recycle = new LinkedList<>();
	}
	
	
@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("1");		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(5));
//		g2d.drawLine(0, 0, 100, 100);	
		for(LinkedList<HashMap<String, Integer>> line:lines){
		for(int i=1; i<line.size(); i++){
			HashMap<String, Integer> p0 = line.get(i-1); 
			HashMap<String, Integer> p1 = line.get(i); 
			Integer p0x = p0.get("x"), p0y = p0.get("y");
			Integer p1x = p1.get("x"), p1y = p1.get("y");
			g2d.drawLine(p0x, p0y, p1x, p1y);
		}
		}
		
		
	}
	void clear(){
		lines.clear();
		repaint();
	}
	void undo(){
		if(lines.size()>0){
		recycle.add(lines.removeLast());
		repaint();
		}
	}
	void redo(){
		if(recycle.size()>0){
		lines.add(recycle.removeLast());
		repaint();
		}
	}

	private class MyListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
//			System.out.println("Pressed: "+ x + "x" + y);
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			HashMap<String, Integer> point= new HashMap<>();
			point.put("x", x); point.put("y", y);
			//將xy帶入point,並將point帶到線中
			line.add(point);
			lines.add(line);//將line新增到lines中,drag會抓新的線
		}
//		@Override//release抓不到point
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			super.mouseReleased(e);
//			int x = e.getX(), y = e.getY();
//			System.out.println("Released: "+ x + "x" + y);
//			
//		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
//			System.out.println("Dragged: "+ x + "x" + y);
			HashMap<String, Integer> point= new HashMap<>();
			point.put("x", x); point.put("y", y);
			//將xy帶入point,並將point帶到線中
//			line.add(point);
			lines.getLast().add(point);
			repaint();
			//每抓到一點drag會進行一次repaint
		}
		
		
//	implements MouseListener //interface須包含五個方法
		
	}
	
	
}
