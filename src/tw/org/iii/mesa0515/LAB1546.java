package tw.org.iii.mesa0515;

import java.util.HashMap;

public class LAB1546 {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put("name", "brad");
		map.put("w", "80");
		map.put("gender", true);
		System.out.println(map.get("name"));
		//map找到對應的值
	}

}
