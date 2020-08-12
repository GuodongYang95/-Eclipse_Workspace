
public class CheeseDecorator extends BurgerDecorator{
	public CheeseDecorator(Burger decoratedBurger) {
		super(decoratedBurger); // Call the BurgerDecorator constructor
	}
	public double getPrice() {
		return super.getPrice() + 1.5; // Add the price of cheese
	}
	public String getDecription() {
		return super.getDescription() + " + Cheese";
	}
}
