
public class DecoratorTest {
	public static void main(String[] args) {
		Burger base = new PlainBurger();
		System.out.println("Burger costs " + base.getPrice() + " and has " + base.getDescription());
		
		Burger cheese = new CheeseDecorator(new PlainBurger());
		System.out.println("Burger costs " + cheese.getPrice() + " and has " + cheese.getDescription());
		
		Burger bacon = new BaconDecorator(new PlainBurger());
		System.out.println("Burger costs " + bacon.getPrice() + " and has " + bacon.getDescription());
		
		Burger all = new BaconDecorator(new CheeseDecorator(new PlainBurger()));
		System.out.println("Burger costs " + all.getPrice() + " and has " + all.getDescription());
	}
	
	abstract class Car {
		   public void accelerate() {
		      System.out.println("Do something to accelerate");
		   }
		   public void applyBrakes() {
		      System.out.println("Do something to apply brakes");
		   }
		   public abstract void changeGears();
		}
	
	class Alto extends Car {
		   public void changeGears() {
		      System.out.println("Implement changeGears() method for Alto Car");
		   }
		}
		class Santro extends Car {
		   public void changeGears() {
		      System.out.println("Implement changeGears() method for Santro Car");
		   }
		}
}	
