package Cars;

public class Acura extends Vehicle {
	
	public void move() {
		System.out.println("this car moves smoothly");
		
	}
	public void stop() {
		System.out.println("car stopped smoothly");
	}
	public String accelerate() {
		
		return "This awesome car is accelerating";
		
	}
	public String decelerate() {
		 int speed = 60;
		 return "The speed is " + speed;
	}
	public void setSpeed() {
		
		
	}
	public void getSpeed() {
		
	}
}
