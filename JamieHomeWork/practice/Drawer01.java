package practice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;
//繪圖板
public class Drawer01 extends JPanel{
	LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycle;
	public Drawer01() {
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
		
//		//serialization
//		try {
//			FileOutputStream fout = new FileOutputStream("dir1/image.ser");
//			ObjectOutputStream oos = new ObjectOutputStream(fout);
//			oos.writeObject(lines);
//			oos.flush();
//			oos.close();
//			System.out.println("Done Serializated");
//			FileInputStream fis = new FileInputStream("dir1/image.ser");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			lines = (LinkedList<LinkedList<HashMap<String,Integer>>>)ois.readObject();
//			fis.close();
//			ois.close();
//			System.out.println("Done de-Serializated");
//			
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(3));
		
		
		
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
			int x = e.getX(), y = e.getY();
			super.mousePressed(e);
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x",x); point.put("y", y);
			line.add(point);
			lines.add(line);
		
			
		}
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			super.mouseReleased(e);
//			int x = e.getX(), y = e.getY();
////			System.out.println("Released:"+x+"x"+y);
//		}
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x",x); point.put("y", y);
//			line.add(point);
			lines.getLast().add(point);
			repaint();
		}
		
	}

}





