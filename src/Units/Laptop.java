package Units;
public class Laptop extends Instrument implements Updatable {

	public Laptop(double price, double capacity, double power) {
		super(price, capacity, power);
	}
	
	public Laptop(double unitPrice, double powerCapacity, double powerAmount, double memory) {
		super(unitPrice, powerCapacity, powerAmount, memory);
	}

	@Override
	public boolean useUnit() {
		System.out.println("The Laptop is used and its power is decreased as "+ powerAmount +" points.");
		return true;
	}

	@Override
	public String toString() {
		return "Laptop =>  Power Amount : " + getPowerAmount() + "  |  " + super.toString() + "  |  Unit Price : "
				+ getUnitPrice() + "  |  Power Capacity : " + getPowerCapacity();
	}

	@Override
	public void update() {
		System.out.println("Memory before update: " + super.memory);
		super.memory += 50;
		System.out.println("Memory after update: " + super.memory);
	}
}
