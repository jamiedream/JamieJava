package tw.org.iii.mesa0515;

import javax.swing.JFrame;
import javax.swing.JButton;

public class LAB1530 extends JFrame {
	private JButton open, save, exit;
	//將class LAB1530封裝到JButton中
	public LAB1530(){
		super ("LAB15");
		
		open = new JButton("Open");//new出button
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		setSize(640, 320);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LAB1530();//呼叫
	}

}
