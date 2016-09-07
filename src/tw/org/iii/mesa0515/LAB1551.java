package tw.org.iii.mesa0515;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//同一網域接收
public class LAB1551 {

	public static void main(String[] args) {
		String x = "Hello!!哈哈";
		byte[] buf = x.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.1.6.65"), 8888);
			socket.send(packet);
			System.out.println("SENT OK");
			socket.close();
		} catch (Exception e) {
			System.out.println("Sent Fail");
		}

	}

}
