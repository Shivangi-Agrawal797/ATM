package Interface;

public class Play {
	
	public static void main(String[] args) {
		System.out.println("user play with MotorCycle");
		
		Car car = new Car();
		car.start();
		car.accelerate();
		car.brake();
		
		
		System.out.println("user play with Car");
		MotorCycle motorCycle = new MotorCycle();
		motorCycle.start();
		motorCycle.accelerate();
		motorCycle.brake();
		
	}

}
