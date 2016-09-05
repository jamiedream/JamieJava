package tw.org.iii.mesa0515;

import java.util.LinkedList;

public class LAB1545 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(0,12);
		list.add(0,12);
		list.add(0,"Hello");
		list.add(0,12.3);
		list.add(0,13.3);
		//(index,value),越新add的會越早出現到同一位置
		System.out.println(list.toString());
	}

}
