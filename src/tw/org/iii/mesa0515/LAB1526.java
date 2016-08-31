package tw.org.iii.mesa0515;

public class LAB1526 {

	public static void main(String[] args) {
		String a1 = "HAHA";
		String a2 = "HAHA";
		String a3 = new String("HAHA");
		String a4 = new String("HAHA");
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println("\n");
		System.out.println(a1==a2);//丟到相同的string pool位置,字串若相同會從同一位置取出
		System.out.println(a3==a4);//new的物件位置不同
		System.out.println(a1.equals(a2));//a1與a2中的字串相比
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));//bike
		
	}

}
