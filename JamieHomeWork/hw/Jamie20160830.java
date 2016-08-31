package hw;

public class Jamie20160830 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = new int[]{0,1,2,3,4,5};//新增0-5數列
		int []swit;
		for(int i=0; i<6; i++){
			for(int j=1; j<i; j++){
			int toSwitch = (int)(Math.random()*(j));
			System.out.println(toSwitch);
		}		
		}
//		//0-5排出不重複數列
//		int []n = new int [6];
//		int []x = new int [6];
//		for(int i=0; i<n.length; i++){
//			int show;
//			boolean repeat;
//			do{
//				show = (int)(Math.random()*6);	//0-5
//				repeat = false;
//				for(int j=0; j<i; j++){
//					if(show == n[j]){
//						repeat = true;
//						break;
//					}
//				}
//			 }while(repeat);
//			n[i] = show;
////
//			System.out.print(show+" ");
			
		}
		
		
	}


