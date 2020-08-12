
public class BaconDecorator extends BurgerDecorator{
	public BaconDecorator(Burger decoratedBurger) {
		super(decoratedBurger); // Call the BurgerDecorator constructor
	}
	public double getPrice() {
		return super.getPrice() + 2; // Add the price of bacon
	}
	public String getDescription() {
		return super.getDescription() + " + Bacon";
	}
}
