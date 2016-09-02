package tw.org.iii.mesa0515;

import javax.swing.JFrame;
import javax.swing.event.AncestorListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LAB1530 extends JFrame implements ActionListener {
	private JButton open, save, exit;
	//將class LAB1530封裝到JButton中
	public LAB1530(){
		super ("LAB15");
		
		setLayout(new FlowLayout());
		open = new JButton("Open");//new出button
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		add(open);add(save);add(exit);
		open.addActionListener(this);
		open.addActionListener(new MyListener());
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("LAB1530");
				
			}
		});
		//add會先呼叫出最後指定的動作,由後往前
		//add可指定多個動作
		
		save.addActionListener(this);
		exit.addActionListener(this);
		
//		//呼叫actionListener的實作,將open指定給Action的函式
//		save.addActionListener(new MyListener());
//		exit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
		
		setSize(640, 320);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//JFrame中一旦使用者關閉視窗,系統停止運行
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LAB1530();//呼叫
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("OPEN");
		if(e.getSource() == open){
			System.out.println("OPEN");
		}else if(e.getSource() == save){
			System.out.println("SAVE");
		}else if(e.getSource() == exit){
			System.out.println("EXIT");
		}
		
	}
	//法1:自己實作一個void
}

class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("SAVE");
		
	}	
}
//法2:另外撰寫一個class


