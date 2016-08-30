package tw.org.iii.mesa0515;

public class LAB1507 {

	public static void main(String[] args) {
//		int a = 10, b = 0;
//		int c = a/b;
//		System.out.println(c);
//		無法運算,分母不為0
		
		double a = 10, b = 0;
		double c = a/b;
		System.out.println(c);
		//宣告為double時0為趨近0的數
		
		int d = 1, e = 2;
		int f = d|e;
		//運算式為&或|,數字會轉換為二進位,1==01;2==10;&時若有一數值為false則結果為false;|時有一數值為true則回傳結果為true
		System.out.println(f);
		int g = d&e;
		System.out.println(g);
		//運算式為^,則二進位中對應為相同數字為0,否則為1,3==11;1+3==01+11==10==2
		int h = 1, i= 3;
		int j = h^i;
		System.out.println(j);
		
	}

}
