import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
public class DrawClock extends JFrame {
	DrawClock() {
		ClockContent JAMIEClock = new ClockContent();
		setLayout(new BorderLayout());
		add(JAMIEClock, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Timer now = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JAMIEClock.doRunning();
			}
		});
		now.start();
	}
	public class ClockContent extends JPanel {
		Calendar forTimeGotcha = new GregorianCalendar();
		String number[] = { "12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
		int sx, sy, mx, my, sx1, sy1;
		double hx, hy;
		int minute, second, hour;
		int OX = 200;
		int OY = 190;
		int i;
		ClockContent() {
			setBackground(Color.BLACK);
		}
		public void doRunning() {
			forTimeGotcha.setTimeInMillis(System.currentTimeMillis());
			repaint();
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			second = forTimeGotcha.get(Calendar.SECOND);
			minute = forTimeGotcha.get(Calendar.MINUTE);
			hour = forTimeGotcha.get(Calendar.HOUR);
			g2d.setColor(Color.WHITE);
			g2d.setStroke(new BasicStroke(1.2f));
			g2d.drawLine(OX, OY, (int) (OX + 100 * Math.sin(second * Math.PI / 30)),
					(int) (OY - 100 * Math.cos(second * Math.PI / 30)));
			g2d.drawLine(OX, OY, (int) (OX + 20 * Math.sin((second - 30) * Math.PI / 30)),
					(int) (OY - 20 * Math.cos((second - 30) * Math.PI / 30)));
			g2d.setColor(Color.magenta);
			g2d.setStroke(new BasicStroke(2));
			g2d.drawLine(OX, OY, (int) (OX + 80 * Math.sin(minute * Math.PI / 30)),
					(int) (OY - 80 * Math.cos(minute * Math.PI / 30)));
			g2d.setColor(Color.orange);
			g2d.setStroke(new BasicStroke(3));
			g2d.drawLine(OX, OY, (int) (OX + 55 * Math.sin((hour + minute / 60.0) * Math.PI / 6)),
					(int) (OY - 55 * Math.cos((hour + minute / 60.0) * Math.PI / 6)));
			g2d.setColor(Color.DARK_GRAY);
			paintNumber(g2d);
		}
		public void paintNumber(Graphics g2d) {
			for (i = 0; i < 60; i++) {
				g2d.drawLine((int) (OX - 115 * Math.cos(i * Math.PI / 30)),
						(int) (OY + 115 * Math.sin(i * Math.PI / 30)), (int) (OX - 120 * Math.cos(i * Math.PI / 30)),
						(int) (OY + 120 * Math.sin(i * Math.PI / 30)));
			}
			for (i = 0; i < 12; i++) {
				g2d.setColor(Color.RED);
				g2d.drawLine((int) (OX - 110 * Math.cos(i * Math.PI / 6)), (int) (OY + 110 * Math.sin(i * Math.PI / 6)),
						(int) (OX - 120 * Math.cos(i * Math.PI / 6)), (int) (OY + 120 * Math.sin(i * Math.PI / 6)));
				g2d.setColor(Color.lightGray);
				g2d.drawString(number[i], (int) (OX + 135 * Math.sin(i * Math.PI / 6)) - 5,
						(int) (OY - 135 * Math.cos(i * Math.PI / 6)) + 5);
			}
		}
	}
	public static void main(String[] args) {
		new DrawClock();
	}
}