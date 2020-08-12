
public class BurgerDecorator extends Burger{
	protected Burger decoratedBurger;
	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}
	public double getPrice() {
		return decoratedBurger.getPrice();
	}
	public String getDescription() {
		return decoratedBurger.getDescription();
	}
}
