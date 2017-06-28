package Cars;

import java.util.Scanner;

import people.Driver;
import people.Person;

public class GoodCars {

	public static void main(String[] args) {
		String i = null;
		Acura acura = new Acura(); 
		Acura bentley = new Acura();
		Acura volve = new Acura();
	
	
		Driver dave = new Driver();
		
		dave.setName(i);
		dave.setHeight(5.4);
		dave.setEyeColor("Brown");
		dave.setHairColor("Brown");
	
		Driver tom = new Driver();
		tom.setName("Tom");
	
		acura.setDriver(i);
		System.out.println("Please input your driver's name");
		Scanner keyboard = new Scanner(System.in);
		i = keyboard.next();
		System.out.println("Look! " + i + " is driving");
		System.out.println("Here is "+ i + "\'s bio");
		System.out.println("His height is " + dave.getHeight());
		System.out.println("His eye color is " + dave.getEyeColor());
		System.out.println("His hair color is " + dave.getHairColor());
		
			
		
		 
			System.out.println("The red Acura is starting");
			System.out.println(acura.getDriver().getName() + " is driving");
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
