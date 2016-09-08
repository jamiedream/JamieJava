package hw;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing001 extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	private int rank;
	public Racing001() {
		super("Racing");
		
		setLayout(new GridLayout(9, 1));
		go = new JButton("Go!");
		add(go);
		lanes = new JLabel[8];//8個跑道
		for(int i = 0; i<lanes.length; i++){
			lanes[i] = new JLabel((i+1)+". ");
			add(lanes[i]);
		}
		//跑道編號

		setSize(1024,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		go.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				go();				
			}
			private void go() {
				rank = 0;
				Car[] cars = new Car[8];
				for(int i=0; i<cars.length; i++){
					cars[i] = new Car(i);//選擇標號
					cars[i].start();//開始
				}
//				for(int i=0; i<cars.length; i++){
//					cars[i].start();
//				}
				
			}

		});
	}
	//車的運行
	private class Car extends Thread{
		private int num;
		Car(int num){this.num=num;}
		@Override
		public void run() {
			for(int i=0; i<100; i++){
				lanes[num].setText(lanes[num].getText()+">");
				//i到終點產生名次+
				if(i==99){
					lanes[num].setText(lanes[num].getText()+ ++rank);
					
				}
				while(rank == 1){
					interrupt();
				}
				
				try {
					Thread.sleep((int)(Math.random()*100));//延遲運作.隨機產生睡眠時間(毫秒)
				} catch (InterruptedException e) {
					break;
				}
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		new Racing001();
	}

}
