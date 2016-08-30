package tw.org.iii.mesa0515;

public class LAB1520 {

	public static void main(String[] args) {
		
		int p[] = new int[6];
		for(int i=0; i<100; i++){
			int point = (int)(Math.random()*9);
			p[point>=6?point-3:point]++;
			}
			for(int i=0; i<6; i++){
			System.out.println((i+1) + "點出現"+ p[i] +"次");
			}
		}
}
		
		
		

	


