package tw.org.iii.mesa0515;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyPainter extends JFrame {
	private Drawer drawer;
	
	public MyPainter(){
		super("MyPainter");
		
		setLayout(new BorderLayout());
		drawer = new Drawer();
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MyPainter();
	}

}
