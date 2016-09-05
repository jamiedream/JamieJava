package tw.org.iii.mesa0515;

import java.util.TreeSet;

public class LAB1544 {
//LOTTERY
	public static void main(String[] args) {
//		HashSet set = new HashSet();
		TreeSet set = new TreeSet();
		//treeset可排序,但物件最好型別相同,才能比較
		while(set.size() < 6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
	}
	

}
