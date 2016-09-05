package practice;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Mypainter01 extends JFrame {
	private Drawer01 drawer01;
	
	public Mypainter01(){
		super("Mypainter01");
		
		setLayout(new BorderLayout());
		drawer01 = new Drawer01();
		add(drawer01, BorderLayout.CENTER);
		
		setSize(1000, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Mypainter01();

	}

}
