import java.util.Scanner;
import java.util.HashMap;

public class CarDealership 
{
    public static void main(String[] args) 
    {
    	HashMap<String, String> cars = new HashMap<>();
    	Scanner scan = new Scanner(System.in);
    	
    	
    	cars.put("Ford", "Taurus");
    	cars.put("Chevrolet", "Truck");
    	cars.put("Tesla", "Model M");
    	cars.put("BMW", "3 Series");
    	cars.put("VW", "Beetle");
    	
    	System.out.println("What car are you looking for?");
    	
    	String carChoice = scan.nextLine();
    	
    	
    	if (cars.containsKey(carChoice))
    	{
    		System.out.println("Oh, " + carChoice + "'s? We have those right over here");
    	}
    	else {
    		System.out.println("I'm sorry, that's not in our inventory right now.");
    	}
    }
}
