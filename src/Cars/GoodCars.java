package Cars;
public class GoodCars {

	public static void main(String[] args) {
		
		Acura acura = new Acura(); 
		Acura bentley = new Acura();
		Acura volve = new Acura();
		
		
		 
			System.out.println("The red Acura is starting");
			System.out.println("The blue Bentley is starting");
			System.out.println("The orange Volve is starting");
			
			
			acura.move();
			bentley.move();
			volve.move();
			
			
			String result = acura.accelerate();
			System.out.println(result);
		
			System.out.println(acura.decelerate()); 
				 
			
			
		 	System.out.println("");

		
		
			System.out.println(acura.accelerate());
			System.out.println(acura.decelerate());
			
			
			System.out.println("");
		
		
			System.out.println(volve.accelerate());
			System.out.println(volve.decelerate()); 
			
			
			System.out.println("");
			
			acura.stop();
	}

}
