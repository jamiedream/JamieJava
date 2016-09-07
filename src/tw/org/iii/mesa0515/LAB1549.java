package tw.org.iii.mesa0515;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LAB1549 extends JFrame{
	private MyGame gameview;
	
	public LAB1549() {
		setLayout(new BorderLayout());
		gameview = new MyGame();
		add(gameview, BorderLayout.CENTER);
		
		setSize(640,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyGame extends JPanel{
		private Timer timer;
//		private int ballX, ballY;
//		private Ball myBall;
		private LinkedList<Ball> balls;
		private int viewW, viewH;
		public MyGame() {
			timer = new Timer();
			timer.schedule(new TimerTask() {				
				@Override
				public void run() {
					repaint();					
				}
			}, 0, 40);
//			Ball = new Ball(0,0,40,40,4, 4, Color.black);
			
			balls = new LinkedList<>();
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					balls.add(new Ball(e.getX()-20, e.getY()-20, 40, 40, 10, 10, Color.black));
				};
			});
		}
//		private class ViewTask extends TimerTask{
//			@Override
//			public void run() {
////				ballX+=10; ballY+=10;
//				repaint();
//			}
//		}
		private class Ball{
			int x, y, w, h, dx, dy;
			Color color;
			private Timer timer;
			public Ball(int x, int y, int w, int h, int dx, int dy, Color color) {
				this.x=x;this.y=y;this.w=w;this.h=h;this.color=color;
				this.dx=dx;this.dy=dy;
				timer = new Timer();
				timer.schedule(new BallTask(), 0, 10);
			}
			private class BallTask extends TimerTask{
				@Override
				public void run() {
					if(x<0 || x+w>viewW){
						dx *= -1;
						
					}else if(y<0 || y+h>viewH){
						
						dy *= -1;
					}
					
					x+=dx;y+=dy;
					
				}
				
			}
			
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D)g;
			
			viewW = getWidth();
			viewH = getHeight();
			for(Ball myBall:balls){
			g2d.setColor(myBall.color);
			g2d.fillOval(myBall.x, myBall.y, myBall.w, myBall.h);
		}
		}
	}
	public static void main(String[] args) {
		new LAB1549();

	}

}
