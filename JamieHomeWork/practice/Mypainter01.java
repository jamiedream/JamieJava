package practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//load簽名能看到物件序列的作用,重製請再建立一次檔案
public class Mypainter01 extends JFrame {
	private Drawer01 drawer01;
	private JButton clear, undo, redo, save, btnSaveDrawer, btnLoadDrawer;
	public Mypainter01(){
		super("MyPainter");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		btnSaveDrawer = new JButton("Save drawer");
		btnLoadDrawer = new JButton("Load drawer");
//		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
//		top.add(clear);top.add(undo);top.add(redo);top.add(save);
		
		JPanel top = new JPanel(new BorderLayout());
		JPanel topLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(topLeft, BorderLayout.WEST);
		top.add(topRight, BorderLayout.EAST);
		topLeft.add(clear);topLeft.add(undo);topLeft.add(redo);topLeft.add(save);
		topLeft.add(btnSaveDrawer);
		topLeft.add(btnLoadDrawer);
				
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
		btnSaveDrawer.addActionListener(new ActionListener(){
            @Override
		            public void actionPerformed(ActionEvent e){
			try{
				FileOutputStream fout = new FileOutputStream("dir1/image.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				oos.writeObject(drawer01);
				oos.close();
				
//				System.out.println("saved");
			} catch (IOException exp) {
				System.out.println(e.toString());
			}
		            }
		    });

	    btnLoadDrawer.addActionListener(new ActionListener(){
		            @Override
		            public void actionPerformed(ActionEvent e){
						try {
							FileInputStream fis = new FileInputStream("dir1/image.ser");
							ObjectInputStream ois = new ObjectInputStream(fis);
							Drawer01 drawer001 = (Drawer01)ois.readObject();
							ois.close();
							fis.close();
							if(drawer001 != null){
								remove(drawer01);
								drawer01=drawer001;
								add(drawer01, BorderLayout.CENTER);
								drawer01.repaint();
								
							}
							
							
			//				System.out.println("LOADED");
						} catch (IOException | ClassNotFoundException exp) {
							System.out.println(e.toString());
						}
		            }
		           
		            
		    });
		
	}


	public static void main(String[] args) {
		new Mypainter01();
	}

}
