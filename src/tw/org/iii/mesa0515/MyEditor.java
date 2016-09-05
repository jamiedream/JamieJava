package tw.org.iii.mesa0515;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame{
	private JButton open, save, exit;
	private JTextArea editor;
	private File openFile;
	//將openFile宣告為在此file的全域變數
	public MyEditor(){
		super("MyEditor");//宣告在父種類顯示的字串
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		top.add(open); top.add(save); top.add(exit);
		add(top, BorderLayout.NORTH);
		
		editor = new JTextArea();
		JScrollPane jsp = new JScrollPane(editor);
		//將editor放到scroll元件中,一旦文件超出範圍會產生,呼叫jsp
		add(jsp, BorderLayout.CENTER);
		
		
		
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
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

	private void doopen() {
		JFileChooser jfc = new JFileChooser();
		if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			//沒有互動時為null
			openFile = jfc.getSelectedFile();
//			System.out.println(openFile.getAbsolutePath());取得絕對路徑
			readFile();
			//開啟資料
		}		
	}

	private void readFile(){
		if( openFile == null) return;
		editor.setText("");//todo
		try {
			FileReader reader = new FileReader(openFile);
			int c;
			while((c = reader.read()) != -1){
				editor.append("" + (char)c);//回傳到editor
//				System.out.print((char)c); //回傳到console
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	protected void dosave() {
		if( openFile == null) return;
		try {
			FileWriter writer = new FileWriter(openFile);
			writer.write(editor.getText());
			writer.flush();
			//將資料輸出到輸出裝置
			writer.close();
			JOptionPane.showMessageDialog(null, "Save OK");
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Save Fail");
		}
		
	}
	
	public static void main(String[] args) {
		new MyEditor();

	}

}
