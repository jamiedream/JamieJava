package tw.org.iii.mesa0515;

public class LAB1521 {

	public static void main(String[] args) {
		//二元陣列
		int [][]a;
		int []b[];
		int c[][];
		a = new int[3][4];
		b = new int[3][];
//		c = new int[][4];  不存在
		b[0] = new int[2];//跟系統require2個空間放置陣列元素
		b[1] = new int[3];
		b[2] = new int[4];
		
		b[0][1] = 1;
		b[1][2] = 2;
		b[2][3] = 3;
		
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("-----");
		
	
		
		//一元陣列
		int []d = new int[3];
		for(int v:d){
			System.out.println(v);
		}
		
		
		
		
	}


}
