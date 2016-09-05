package tw.org.iii.mesa0515;
//測試003
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LAB1522PRA extends JFrame{
	private JButton open,save,exit;
	private JTextArea editor;
	private File openFile;
	
	public LAB1522PRA(){
		super("My Editor");
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		editor = new JTextArea();
		add(editor, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	private void doOpen(){
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null)==
				JFileChooser.APPROVE_OPTION){
			openFile = jfc.getSelectedFile();
			readFile();
		}
	}
	private void readFile(){
		if (openFile==null) return;
		editor.setText("");
		try {
			FileReader reader = new FileReader(openFile);
			int c;
			while ( (c = reader.read()) != -1){
				editor.append("" + (char)c);
			}
			reader.close();
		} catch (Exception e) {
		}
		
	}
	private void doSave(){
		
	}
	
	public static void main(String[] args) {
		new LAB1522PRA();
	}

}