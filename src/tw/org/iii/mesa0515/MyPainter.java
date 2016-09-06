package tw.org.iii.mesa0515;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyPainter extends JFrame {
	private Drawer drawer;
	private JButton clear, undo, redo, save;
	private Myclock clock;
	public MyPainter(){
		super("MyPainter");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
//		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
//		top.add(clear);top.add(undo);top.add(redo);top.add(save);
		clock = new Myclock();//
		JPanel top = new JPanel(new BorderLayout());
		JPanel topLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		topLeft.add(clear);topLeft.add(undo);topLeft.add(redo);topLeft.add(save);
		topRight.add(clock);
		add(topLeft, BorderLayout.WEST);
		add(topRight, BorderLayout.EAST);
		add(top, BorderLayout.NORTH);
		
		
		drawer = new Drawer();
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		clear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				cleardrawer();				
			}
			private void cleardrawer() {
				drawer.clear();
				//在Drawer中定義
			}
		});
		undo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				undodrawer();				
			}
			private void undodrawer() {
				// TODO Auto-generated method stub
				drawer.undo();
			}
		});
		redo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				redodrawer();				
			}
			private void redodrawer() {
				// TODO Auto-generated method stub
				drawer.redo();
			}
		});
		save.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				dosave();		
			}
			private void dosave() {
				BufferedImage bImg = new BufferedImage(drawer.getWidth(), drawer.getHeight(), BufferedImage.TYPE_INT_ARGB);
			    Graphics2D cg = bImg.createGraphics();
			    drawer.paintAll(cg);
			    try {
			            if (ImageIO.write(bImg, "png", new File("dir1/image.png")))
			            {
			                JOptionPane.showMessageDialog(null, "Save OK");
			            }
			    } catch (IOException e) {
			    	JOptionPane.showMessageDialog(null, "Save Fail");
			    }				
			}
		});
		
	}


	public static void main(String[] args) {
		new MyPainter();
	}

}
