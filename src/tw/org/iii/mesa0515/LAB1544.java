package tw.org.iii.mesa0515;

import java.util.Iterator;
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
		
		//迭代
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			Object obj = it.next();
//			System.out.println((int)obj);
//		}
//		System.out.println("------");
		for(Object obj:set ){
			//object可在只有單一物件時使用,為預設函數
			System.out.println((int)obj);
		}
		//常用for each
		
	}
	

}
