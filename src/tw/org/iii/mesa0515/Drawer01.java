package tw.org.iii.mesa0515;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Drawer01 extends JPanel{
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	System.out.println("0");
}
@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		System.out.println("1");
	}
	

}
