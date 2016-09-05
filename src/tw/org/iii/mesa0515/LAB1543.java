package tw.org.iii.mesa0515;

import java.util.HashSet;

public class LAB1543 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(12);   //SET會將int, double, string轉成物件存取
		set.add("Hello");
		set.add(12.3);
		set.add(new student("Jamie" ,1, 2, 3));
		set.add(new student("Jamie" ,1, 2, 3));
		set.add(12);
		set.add("Hello");
		//set為不重複無順序性interface
		System.out.println(set.size());
		System.out.println(set.toString());
		
		//不同型別無法用treeset比較排序
	}

}
