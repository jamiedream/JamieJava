package practice;

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

public class Mypainter01 extends JFrame {
	private Drawer01 drawer01;
	private JButton clear, undo, redo, save;
	public Mypainter01(){
		super("MyPainter");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
//		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
//		top.add(clear);top.add(undo);top.add(redo);top.add(save);
		
		JPanel top = new JPanel(new BorderLayout());
		JPanel topLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		add(topLeft, BorderLayout.WEST);
		add(topRight, BorderLayout.EAST);
		topLeft.add(clear);topLeft.add(undo);topLeft.add(redo);topLeft.add(save);
		
		
		add(top, BorderLayout.NORTH);
		
		
		drawer01 = new Drawer01();
		add(drawer01, BorderLayout.CENTER);
		
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		clear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				cleardrawer();				
			}
			private void cleardrawer() {
				drawer01.clear();
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
				drawer01.undo();
			}
		});
		redo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				redodrawer();				
			}
			private void redodrawer() {
				// TODO Auto-generated method stub
				drawer01.redo();
			}
		});
		save.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				dosave();		
			}
			private void dosave() {
				BufferedImage bImg = new BufferedImage(drawer01.getWidth(), drawer01.getHeight(), BufferedImage.TYPE_INT_ARGB);
			    Graphics2D cg = bImg.createGraphics();
			    drawer01.paintAll(cg);
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
		new Mypainter01();
	}

}
