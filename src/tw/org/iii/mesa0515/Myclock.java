package tw.org.iii.mesa0515;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Myclock extends JLabel {
	private Timer timer;
	public Myclock() {
		timer = new Timer();
		timer.schedule(new Mytask(), 0, 500);
	}
	private class Mytask extends TimerTask{
		@Override
		public void run() {
			Calendar now = Calendar.getInstance();
			int hh = now.get(Calendar.HOUR_OF_DAY);
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh+":"+mm+":"+ss);
		}
	}
}
