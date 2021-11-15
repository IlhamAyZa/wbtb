package Units;

public abstract class Unit {

	protected static int unitQuantity = 0;
	protected double unitPrice;
	protected double powerCapacity;

	public Unit(double unitPrice, double powerCapacity) {

		if (unitPrice <= 0) {
			this.unitPrice = 0;
		} else {
			this.unitPrice = unitPrice;
		}

		if (powerCapacity <= 0) {
			this.powerCapacity = 0;
		} else {
			this.powerCapacity = powerCapacity;
		}

		unitQuantity++;
	}

	public static int getUnitQuantity() {
		return unitQuantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	public double getPowerCapacity() {
		return powerCapacity;
	}

	public abstract boolean useUnit();
}
