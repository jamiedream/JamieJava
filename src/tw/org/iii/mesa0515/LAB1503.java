package tw.org.iii.mesa0515;

public class LAB1503 {
	public static void main(String[] args){
		byte a = 127;
		a ++;
		//++超出byte範圍(-128~127)後會直接進行轉換
		System.out.println(a);
		
		a += 4;
		System.out.println(a);
		//+=為ASSIGN指令,byte會進行內部轉譯後輸出
		
		long b;
		b = 12L;
		b = 12;
		System.out.println(b);
		
		int d;
		d = 12;
		System.out.println(d);
		d = 031;
		System.out.println(d);
		//0開頭表示為8進位,031=3*8+1
		
		
		
	}
}
