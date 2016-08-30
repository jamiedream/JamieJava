package tw.org.iii.mesa0515;

public class LAB1508 {
	public static void main(String[] args) {
		double temp = Math.random();
		double score = (int) (temp * 101);
		// 亂數產生40-69,30個數字位移40=====(int)(temp*30+40)
		System.out.println(score);

		// if(score>=90){
		// System.out.println('A');
		// }else{
		// if(score>=80){
		// System.out.println('B');
		// }
		// if(score>=70){
		// System.out.println('C');
		// }
		// if(score>=60){
		// System.out.println('D');
		// }
		// if(score<=59){
		// System.out.println('E');
		// }
		//
		// }

		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {
			System.out.println('E');
		}

	}
}
