package tw.org.iii.mesa0515;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//同一網域發送
public class LAB1552 {

	public static void main(String[] args) {
		while(true){
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			
			InetAddress add = packet.getAddress();
			byte[] data = packet.getData();
			int len = packet.getLength();
			System.out.println(add.getHostAddress()+":"+
			new String(data,0,len));
			socket.close();
//			System.out.println("RECEIVED");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		}
	}

}
