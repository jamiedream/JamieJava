package practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Myeditor01 extends JFrame{
	private JButton open, save, exit;
	private JTextArea editor;
	private File openfile;
	
	public Myeditor01(){
		super("Myeditor01");
		
		setLayout(new BorderLayout());//版面配置
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		//top panel設定
		add(top, BorderLayout.NORTH);
		top.add(open); top.add(save); top.add(exit);
		
		editor = new JTextArea();
		JScrollPane jsb = new JScrollPane(editor);
		add(jsb, BorderLayout.CENTER);
		
		//視窗
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//button功能設定
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doopen();	
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dosave();	
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		
	}
	
	protected void doopen(){
		//開啟
		JFileChooser jfc = new JFileChooser();
		//使用指定路徑開啟視窗
		jfc.setCurrentDirectory(new File("j:/Java/workspace/JamieJava"));
		//showOpenDialog開啟路徑視窗,回傳值為ok(approve option)
		if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ){
		openfile = jfc.getSelectedFile();
		//開啟選擇到的file
//		System.out.println(openfile);//路徑
		readThisFile();
		}
		
	}

	private void readThisFile(){
		if(openfile == null) return;//開啟的資料空值不往下作業
		try {
			FileReader reader = new FileReader(openfile);
			int c;
			while((c = reader.read()) != -1){
				editor.append(""+(char)c);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	protected void dosave() {
		if(openfile == null) return;
		try {
			FileWriter writer = new FileWriter(openfile);
			writer.write(editor.getText());
			writer.flush();
			writer.close();
			JOptionPane.showMessageDialog(null, "Save OK");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Save Fail");
			
		}
		
	}

	public static void main(String[] args) {
		new Myeditor01();
	}

}
