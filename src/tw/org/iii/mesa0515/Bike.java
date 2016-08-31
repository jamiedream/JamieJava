package tw.org.iii.mesa0515;

public class Bike {
	private double speed;
	private int color;
	
	Bike(){
		System.out.print("Bike()");
		color = 2;
	}
	Bike(int c){
		System.out.print("Bike(int)");
		color = c;
	}

	
	void upspeed(){
		speed = (speed<1?1:speed*1.2);
	}
	void upspeed(int gear){
		speed = (speed<1?1:speed*(1.2+gear));
	}
	
	void downspeed(){
		speed = (speed<1?0:speed*0.7);	
	}
	
	double getSpeed(){
		return speed;
	}
	@Override
	public String toString() {
		return "My Bike";
	}
	//lab1525 sysout
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	//lab1526 sysout
	
}
